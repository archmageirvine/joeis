package irvine.oeis.a054;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054670 Numerators of (reduced) coefficients of Laurent series for conformal mapping from exterior of unit disk onto exterior of Mandelbrot set.
 * @author Sean A. Irvine
 */
public class A054670 extends MemoryFunction1<Q> implements Sequence {

  // After Gerald Edgar

  private int mN = -1;

  private final MemoryFunction2<Integer, Q> mU = new MemoryFunction2<Integer, Q>() {
    @Override
    protected Q compute(final Integer n, final Integer k) {
      final int t = (1 << n) - 1;
      if (t == k) {
        return Q.ONE;
      } else if (t > k) {
        return Rationals.SINGLETON.sum(0, k, j -> mU.get(n - 1, j).multiply(mU.get(n - 1, k - j)));
      } else if ((1 << (n + 1)) - 1 > k) {
        return Q.ZERO;
      } else {
        return mU.get(n + 1, k).subtract(Rationals.SINGLETON.sum(1, k - 1, j -> mU.get(n, j).multiply(mU.get(n, k - j)))).divide(2);
      }
    }
  };

  private Q a(final int j) {
    return mU.get(0, j + 1);
  }

  private final MemoryFunction2<Integer, Q> mV = new MemoryFunction2<Integer, Q>() {
    @Override
    protected Q compute(final Integer k, final Integer j) {
      if (k == 1) {
        Q sum = a(j - 2).negate();
        for (int l = 2; l < j; ++l) {
          sum = sum.subtract(get(1, l).multiply(a(j - l - 1)));
        }
        return sum;
      } else {
        return mV.get(1, j - k + 1).add(mV.get(k - 1, j - 1))
          .add(Rationals.SINGLETON.sum(2, j - k, l -> mV.get(1, l).multiply(mV.get(k - 1, j - l))));
      }
    }
  };

  // b
  @Override
  protected Q compute(final int n) {
    if (n == 0) {
      return a(0).negate();
    } else {
      Q sum = a(n).negate();
      for (int k = 1; k < n; ++k) {
        sum = sum.subtract(get(k).multiply(mV.get(k, n)));
      }
      return sum;
    }
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(get(++mN));
  }
}
