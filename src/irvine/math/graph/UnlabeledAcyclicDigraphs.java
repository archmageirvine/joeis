package irvine.math.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.MemoryFunction;
import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Arc enumerators for unlabeled acyclic digraphs.
 * @author Gregory Morse
 */
public final class UnlabeledAcyclicDigraphs {

  /** The constraints on the digraph. */
  public enum Kind {
    /** No restriction. */
    ALL,
    /** Weakly connected. */
    CONNECTED,
    /** One source. */
    SOURCE,
    /** One source and one sink. */
    SOURCE_SINK
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final boolean mByArcs;
  private final int mMaxDegree;

  /**
   * Construct an enumerator.
   * @param byArcs false to specialize the arc variable to 1
   */
  public UnlabeledAcyclicDigraphs(final boolean byArcs) {
    this(byArcs, Integer.MAX_VALUE);
  }

  /**
   * Construct an arc enumerator retaining only the requested degrees.
   * @param maxDegree maximum number of arcs to count
   */
  public UnlabeledAcyclicDigraphs(final int maxDegree) {
    this(true, maxDegree);
  }

  private UnlabeledAcyclicDigraphs(final boolean byArcs, final int maxDegree) {
    mByArcs = byArcs;
    mMaxDegree = maxDegree;
  }

  private Polynomial<Q> orbit(final int size) {
    return size > mMaxDegree ? RING.one() : RING.add(RING.one(), RING.monomial(Q.ONE, mByArcs ? size : 0));
  }

  private final MemoryFunctionInt2<Polynomial<Q>> mEdges = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Q> compute(final int s, final int t) {
      final int gcd = Functions.GCD.i(s, t);
      return RING.pow(orbit(s / gcd * t), gcd, mMaxDegree);
    }
  };

  private final MemoryFunction<List<Integer>, Polynomial<Q>> mAll = new MemoryFunction<>() {
    @Override
    protected Polynomial<Q> compute(final List<Integer> cycles) {
      return fixed(cycles, Kind.ALL);
    }
  };

  private final MemoryFunction<List<Integer>, Polynomial<Q>> mSource = new MemoryFunction<>() {
    @Override
    protected Polynomial<Q> compute(final List<Integer> cycles) {
      return fixed(cycles, Kind.SOURCE);
    }
  };

  // Inclusion-exclusion over cycles of sources, or of sinks other than the fixed
  // source. See the PARI program by Andrew Howroyd linked from A122078.
  private Polynomial<Q> fixed(final List<Integer> cycles, final Kind kind) {
    if (cycles.isEmpty()) {
      return RING.one();
    }
    Polynomial<Q> sum = RING.zero();
    for (final Pair<List<Integer>, Z> subset : PartMultisets.subsets(cycles)) {
      final List<Integer> selected = subset.left();
      if (selected.isEmpty()) {
        continue;
      }
      final int multiplicity = kind == Kind.SOURCE_SINK ? Collections.frequency(selected, 1) : 1;
      if (multiplicity == 0) {
        continue;
      }
      final List<Integer> rest = PartMultisets.subtract(cycles, selected);
      Polynomial<Q> term = (kind == Kind.ALL ? mAll : mSource).getValue(rest);
      for (final int s : selected) {
        Polynomial<Q> edges = kind == Kind.ALL ? RING.one() : orbit(s);
        for (final int t : rest) {
          edges = RING.multiply(edges, mEdges.get(s, t), mMaxDegree);
        }
        term = RING.multiply(term, kind == Kind.ALL ? edges : RING.subtract(edges, RING.one()), mMaxDegree);
      }
      sum = RING.signedAdd((selected.size() & 1) == 1, sum,
        RING.multiply(term, new Q(subset.right().multiply(multiplicity))));
    }
    return sum;
  }

  private Polynomial<Q> burnside(final int n, final Kind kind) {
    final int size = kind == Kind.ALL ? n : n - 1;
    if (size < 0) {
      return RING.zero();
    }
    Polynomial<Q> sum = RING.zero();
    final IntegerPartition partitions = new IntegerPartition(size);
    int[] p;
    while ((p = partitions.next()) != null) {
      final List<Integer> cycles = Arrays.stream(p).sorted().boxed().collect(Collectors.toList());
      final Polynomial<Q> term;
      switch (kind) {
        case ALL:
          term = mAll.getValue(cycles);
          break;
        case SOURCE:
          term = mSource.getValue(cycles);
          break;
        default:
          term = fixed(cycles, Kind.SOURCE_SINK);
          break;
      }
      sum = RING.add(sum, RING.multiply(term, new Q(Z.ONE, IntegerPartition.aut(p))));
    }
    return sum;
  }

  private final MemoryFunction1<Polynomial<Q>> mDags = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      return burnside(n, Kind.ALL);
    }
  };

  private final MemoryFunction1<Polynomial<Q>> mLog = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      if (n == 0) {
        return RING.zero();
      }
      Polynomial<Q> sum = mDags.get(n);
      for (int k = 1; k < n; ++k) {
        sum = RING.subtract(sum, RING.multiply(RING.multiply(get(k), mDags.get(n - k), mMaxDegree), new Q(k, n)));
      }
      return sum;
    }
  };

  private final MemoryFunction1<Polynomial<Q>> mConnected = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      // Inverse Euler transform, substituting y^k for y as well as x^k for x.
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= n; ++k) {
        if (n % k == 0) {
          final int mu = Functions.MOBIUS.i(k);
          if (mu != 0) {
            sum = RING.add(sum, RING.multiply(mLog.get(n / k).substitutePower(k, mMaxDegree), new Q(mu, k)));
          }
        }
      }
      return sum;
    }
  };

  private final MemoryFunction1<Polynomial<Q>> mSourceRows = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      return burnside(n, Kind.SOURCE);
    }
  };

  private final MemoryFunction1<Polynomial<Q>> mSourceSinkRows = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      return burnside(n, Kind.SOURCE_SINK);
    }
  };

  /**
   * Return a polynomial in the arc variable.
   * @param n number of vertices (positive for graphs with restrictions)
   * @param kind digraph class
   * @return arc enumerator, or constant vertex count if arcs are not tracked
   */
  public Polynomial<Q> row(final int n, final Kind kind) {
    switch (kind) {
      case ALL:
        return mDags.get(n);
      case CONNECTED:
        return mConnected.get(n);
      case SOURCE:
        return mSourceRows.get(n);
      default:
        return mSourceSinkRows.get(n);
    }
  }
}
