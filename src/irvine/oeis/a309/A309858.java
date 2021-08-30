package irvine.oeis.a309;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309858 Number A(n,k) of k-uniform hypergraphs on n unlabeled nodes; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A309858 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mD = -1;
  private int mN = 0;

  private int ilcm(final List<Integer> k, List<Integer> p, final int q) {
    int lcm = 1;
    for (int i = 0; i < q; ++i) {
      if (k.get(i) > 0) {
        lcm = IntegerUtils.lcm(lcm, p.get(i));
      }
    }
    return lcm;
  }

  private boolean and(final List<Integer> p, final List<Integer> k, final int q, final int t) {
    for (int i = 0; i < q; ++i) {
      final int g = IntegerUtils.gcd(t, p.get(i));
      if (k.get(i) % (p.get(i) / g) != 0) {
        return false;
      }
    }
    return true;
  }

  private List<List<Integer>> g(final List<Integer> l, final int i, final int n) {
    if (i == 0) {
      return n == 0 ? Collections.singletonList(Collections.emptyList()) : Collections.emptyList();
    }
    final List<List<Integer>> res = new ArrayList<>();
    for (int j = 0; j <= Math.min(l.get(i - 1), n); ++j) { // -1 my lists number from 0
      final List<List<Integer>> g = g(l, i - 1, n - j);
      for (final List<Integer> gg : g) {
        final ArrayList<Integer> t = new ArrayList<>(gg);
        t.add(j);
        res.add(t);
      }
    }
    return res;
  }

  private Z h(final List<Integer> p, final int v) {
    final int q = p.size();
    Z sum = Z.ZERO;
    for (final List<Integer> k : g(p, q, v)) {
      final int s = ilcm(k, p, q);
      Z s2 = Z.ZERO;
      for (int t = 1; t <= s; ++t) {
        if (and(p, k, q, t )) {
          Z prod = Z.ONE;
          for (int i = 0; i < q; ++i) {
            final int m = IntegerUtils.gcd(t, p.get(i));
            prod = prod.multiply(Binomial.binomial(m, k.get(i) * m / p.get(i)));
          }
          s2 = s2.add(prod);
        }
      }
      sum = sum.add(s2.divide(s));
    }
    return sum;
  }

  private Q b(final int n, final int i, final ArrayList<Integer> l, final int v) {
    if (n == 0 || i == 1) {
      for (int k = 0; k < n; ++k) {
        l.add(1);
      }
      final Z h = h(l, v);
      l.subList(l.size() - n, l.size()).clear(); // reset list
      return new Q(Z.ONE.shiftLeft(h.intValueExact()), mF.factorial(n));
    } else {
      Q sum = Q.ZERO;
      Z ij = Z.ONE;
      final int origSize = l.size();
      for (int j = 0; j <= n / i; ++j, l.add(i), ij = ij.multiply(i)) {
        sum = sum.add(b(n - i * j, i - 1, l, v).divide(mF.factorial(j)).divide(ij));
      }
      l.subList(origSize, l.size()).clear(); // reset list
      return sum;
    }
  }

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k > n) {
      return Z.ONE;
    }
    if (k > n - k) {
      return get(n, n - k);
    }
    return b(n, n, new ArrayList<>(), k).toZ();
  }

  @Override
  public Z next() {
    if (++mN > mD) {
      ++mD;
      mN = 0;
    }
    return get(mN, mD - mN);
  }

}
