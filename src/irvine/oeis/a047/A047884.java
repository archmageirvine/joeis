package irvine.oeis.a047;

import java.util.ArrayList;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047884 Triangle of numbers a(n,k) = number of Young tableaux with n cells and k rows (1 &lt;= k &lt;= n); also number of self-inverse permutations on n letters in which the length of the longest scattered (i.e., not necessarily contiguous) increasing subsequence is k.
 * @author Sean A. Irvine
 */
public class A047884 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mG = null;

  private Z h(final List<Integer> l) {
    final int n = l.size();
    int num = 0;
    for (final int v : l) {
      num += v;
    }
    Z den = Z.ONE;
    for (int i = 0; i < n; ++i) {
      for (int j = 1; j <= l.get(i); ++j) {
        int c = 1 + l.get(i) - j;
        for (int k = i + 1; k < n; ++k) {
          if (l.get(k) >= j) {
            ++c;
          }
        }
        den = den.multiply(c);
      }
    }
    return mF.factorial(num).divide(den);
  }

  protected Polynomial<Z> g(final int n, final int i, final ArrayList<Integer> l) {
    if (n == 0 || i == 1) {
      for (int k = 0; k < n; ++k) {
        l.add(1);
      }
      final int exponent = l.isEmpty() ? 0 : l.get(0);
      final Z h = h(l);
      l.subList(l.size() - n, l.size()).clear();
      return RING.monomial(h, exponent);
    } else {
      Polynomial<Z> sum = RING.zero();
      for (int j = 0; j <= n / i; ++j) {
        if (j > 0) {
          l.add(i);
        }
        sum = RING.add(sum, g(n - i * j, i - 1, l));
      }
      l.subList(l.size() - n / i, l.size()).clear();
      return sum;
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mG = g(++mN, mN, new ArrayList<>());
      mM = 1;
    }
    return mG.coeff(mM);
  }
}

