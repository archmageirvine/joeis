package irvine.oeis.a339;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a052.A052107;

/**
 * A339063 Number of unlabeled simple graphs with n edges rooted at two noninterchangeable vertices.
 * @author Sean A. Irvine
 */
public class A339063 extends A052107 {
  private final boolean mOrdered;

  protected A339063(final boolean ordered) {
    super(0);
    mOrdered = ordered;
  }

  /** Construct the sequence. */
  public A339063() {
    this(true);
  }

  // After Andrew Howroyd

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final int[] PREFIX = {1, 1};
  private static final int[] SWAPPED = {2};
  private int mM = -1;

  protected Polynomial<Z> edgeOrbit(final int size, final int degreeLimit) {
    return RING.onePlusXToTheN(size);
  }

  protected boolean hasLoops() {
    return false;
  }

  protected final Polynomial<Z> edgesPoly(final int[] v, final int degreeLimit) {
    final int[] orbits = new int[degreeLimit + 1];
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = Functions.GCD.i(v[i], v[j]);
        final int size = v[i] * v[j] / g;
        if (size <= degreeLimit) {
          orbits[size] += g;
        }
      }
    }
    for (final int c : v) {
      if (c <= degreeLimit) {
        orbits[c] += (c - 1) / 2 + (hasLoops() ? 1 : 0);
      }
      if ((c & 1) == 0 && c / 2 <= degreeLimit) {
        ++orbits[c / 2];
      }
    }
    Polynomial<Z> prod = RING.one();
    for (int size = 1; size <= degreeLimit; ++size) {
      if (orbits[size] != 0) {
        prod = RING.multiply(prod, RING.pow(edgeOrbit(size, degreeLimit), orbits[size], degreeLimit), degreeLimit);
      }
    }
    return prod;
  }

  private Polynomial<Z> g(final int n, final int[] prefix, final int degreeLimit) {
    Polynomial<Z> sum = RING.zero();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      final int[] q = Arrays.copyOf(prefix, p.length + prefix.length);
      System.arraycopy(p, 0, q, prefix.length, p.length);
      final Polynomial<Z> t = RING.multiply(edgesPoly(q, degreeLimit), IntegerPartition.permCount(p, 1));
      sum = RING.add(sum, t);
    }
    return RING.divide(sum, Functions.FACTORIAL.z(n));
  }

  protected int[] getPrefix() {
    return PREFIX;
  }

  protected final Polynomial<Z> rootedCounts(final int n, final int degreeLimit) {
    final Polynomial<Z> ordered = g(n, getPrefix(), degreeLimit);
    return mOrdered ? ordered : RING.divide(RING.add(ordered, g(n, SWAPPED, degreeLimit)), Z.TWO);
  }

  protected final Polynomial<Z> unrootedCounts(final int n, final int degreeLimit) {
    return g(n, new int[0], degreeLimit);
  }

  private Sequence0 withPrefix(final int... prefix) {
    return new Sequence0() {
      private int mEdges = -1;

      @Override
      public Z next() {
        return ++mEdges == 0 ? Z.ONE : g(2 * mEdges, prefix, mEdges).coeff(mEdges);
      }
    };
  }

  /**
   * Count graphs without marked vertices by number of edges, ignoring isolates.
   * @return the unrooted sequence
   */
  public final Sequence0 unrooted() {
    return withPrefix();
  }

  final Sequence0 singlyRooted() {
    return withPrefix(1);
  }

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ONE;
    }
    return rootedCounts(2 * mM, mM).coeff(mM);
  }
}
