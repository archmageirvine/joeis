package irvine.oeis.a259;

import java.util.ArrayList;
import java.util.List;

import irvine.math.MemoryFunction1;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259976 Irregular triangle T(n, k) read by rows (n &gt;= 0, 0 &lt;= k &lt;= A011848(n)): T(n, k) is the number of occurrences of the principal character in the restriction of xi_k to S_(n)^(2).
 * @author Sean A. Irvine
 */
public class A259976 extends MemoryFunction1<CycleIndex> implements Sequence {

  // After Andrey Zabolotskiy

  private int mN = -1;
  private int mM = 0;

  private int[] rl(final int n, final int[] a) {
    final int[] v = new int[n];
    for (final int x : a) {
      ++v[x - 1];
    }
    return v;
  }

  // Generates the polynomial which calculates the character of some symmetric group S_m
  // corresponding to the partition [m-q, q] for a permutation with given set of cycles
  // see F. D. Murnaghan, The theory of group representations, any edition, p. 144
  @Override
  protected CycleIndex compute(final int q) {
    if (q == 0) {
      return CycleIndex.ONE;
    }
    if (q == 1) {
      return new CycleIndex("X(1)", MultivariateMonomial.create(0, 0L, Q.NEG_ONE), MultivariateMonomial.create(1, 1));
    }

    final CycleIndex s = new CycleIndex("X(" + q + ")");
    IntegerPartition pp = new IntegerPartition(q - 1);
    int[] sigma;
    while ((sigma = pp.next()) != null) {
      final int[] r = rl(q - 1, sigma);
      CycleIndex term = new CycleIndex("",
        MultivariateMonomial.create(0, 0, new Q(-2L * r[0] - 1)),
        MultivariateMonomial.create(1, 1)
        );
      term.multiply(new Q(1, r[0] + 1));
      for (int i = 0; i < r.length; ++i) {
        final int v = r[i];
        for (int j = 1; j <= v; ++j) {
          final CycleIndex copy = term.copy();
          copy.multiply(new Q(1 - j));
          final MultivariateMonomial mm = MultivariateMonomial.create(i + 1, 1);
          term = term.multiply(mm);
          term.add(copy);
          term.multiply(new Q(1, j));
        }
      }
      s.add(term);
    }
    pp = new IntegerPartition(q);
    int[] beta;
    while ((beta = pp.next()) != null) {
      final int[] r = rl(q, beta);
      if (r[0] != 0) {
        continue;
      }
      CycleIndex term = CycleIndex.ONE.copy();
      for (int i = 0; i < r.length; ++i) {
        final int v = r[i];
        for (int j = 1; j <= v; ++j) {
          final CycleIndex copy = term.copy();
          copy.multiply(new Q(1 - j));
          final MultivariateMonomial mm = MultivariateMonomial.create(i + 1, 1);
          term = term.multiply(mm);
          term.add(copy);
          term.multiply(new Q(1, j));
        }
      }
      s.add(term);
    }
    return s;
  }

  private long[] cycles(final List<Integer> p) {
    final long[] r = new long[p.size() + 1];
    for (int i0 = 0; i0 < p.size(); ++i0) {
      int i = i0;
      int j = 1;
      while (p.get(i) > i0) {
        i = p.get(i);
        ++j;
      }
      if (p.get(i) == i0) {
        ++r[j];
      }
    }
    return r;
  }

  private List<Integer> edges(final List<Integer> p) {
    final ArrayList<Integer> r = new ArrayList<>();
    for (int v2 = 0; v2 < p.size(); ++v2) {
      final int u2 = p.get(v2);
      for (int v1 = 0; v1 < v2; ++v1) {
        final int u1 = p.get(v1);
        final int w1, w2;
        if (u1 < u2) {
          w1 = u1;
          w2 = u2;
        } else {
          w1 = u2;
          w2 = u1;
        }
        r.add(w2 * (w2 - 1) / 2 + w1);
      }
    }
    return r;
  }

  // Constructs a permutation from cycles
  private List<Integer> fromCycles(final int[] pp) {
    final List<Integer> perm = new ArrayList<>();
    int s = 0;
    for (final int cyc : pp) {
      for (int i = 1; i < cyc; ++i) {
        perm.add(s + i);
      }
      perm.add(s);
      s += cyc;
    }
    return perm;
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  // See Merris & Watkins paper, pp. 539-541
  protected Z t(final int q, final int p) {
    if (q == 0) {
      return Z.ONE;
    }

    final CycleIndex xiq = get(q);
    Q r = Q.ZERO;
    final IntegerPartition ppp = new IntegerPartition(p);
    int[] pp;
    while ((pp = ppp.next()) != null) {
      final Q t = new Q(IntegerPartition.permCount(pp), mF.factorial(p));
      final long[] sigma = cycles(edges(fromCycles(pp)));
      r = r.add(xiq.eval(sigma).multiply(t));
    }
    assert r.isInteger();
    return r.toZ();
  }

  @Override
  public Z next() {
    final int qmax = mN * (mN - 1) / 4;
    if (++mM > qmax) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN);
  }
}
