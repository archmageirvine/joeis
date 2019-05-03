package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A047874 Triangle of numbers <code>T(n,k) =</code> number of permutations of <code>(1,2,...,n)</code> with longest increasing subsequence of length k <code>(1&lt;=k&lt;=n)</code>.
 * @author Sean A. Irvine
 */
public class A047874 implements Sequence {

  private final MemoryFactorial mFactorial = new MemoryFactorial();

  private Z h(final ArrayList<Integer> l) {
    int s = 0;
    for (final int v : l) {
      s += v;
    }
    final Z f = mFactorial.factorial(s);
    Z p = Z.ONE;
    for (int i = 0; i < l.size(); ++i) {
      for (int j = 1; j <= l.get(i); ++j) {
        long t = 1 + l.get(i) - j;
        for (int k = i + 1; k < l.size(); ++k) {
          if (l.get(k) >= j) {
            ++t;
          }
        }
        p = p.multiply(t);
      }
    }
    return f.divide(p);
  }

  protected Z g(final int n, final int i, final ArrayList<Integer> l) {
    if (n == 0 || i == 1) {
      final ArrayList<Integer> h = new ArrayList<>(l);
      for (int k = 0; k < n; ++k) {
        h.add(1);
      }
      return h(h).square();
    } else {
      Z s = Z.ZERO;
      if (i > 1) {
        for (int j = 0; j <= n / i; ++j) {
          final ArrayList<Integer> h = new ArrayList<>(l);
          for (int k = 0; k < j; ++k) {
            h.add(i);
          }
          s = s.add(g(n - i * j, i - 1, h));
        }
      }
      return s;
    }
  }

  private int mN = 0;
  private int mP = 0;

  @Override
  public Z next() {
    if (++mP > mN) {
      ++mN;
      mP = 1;
    }
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(mP);
    return g(mN - mP, Math.min(mN - mP, mP), l);
  }
}
