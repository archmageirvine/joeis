package irvine.math.cr;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Otter constants.
 * @author Sean A. Irvine
 */
public final class OtterConstants {

  private final MemoryFunction1<Z> mA = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 1, k -> get(k).multiply(mS.get(n - 1, k)).multiply(k)).divide(n - 1);
    }
  };

  private final MemoryFunctionInt2<Z> mS = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n + 1 - k < 1) {
        return Z.ZERO;
      }
      Z res = mA.get(n + 1 - k);
      if (n >= 2 * k) {
        res = res.add(mS.get(n - k, k));
      }
      return res;
    }
  };

  private class BigA extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return new CR() {
        @Override
        protected Z approximate(final int precision) {
          Z sum = Z.ZERO;
          int k = 0;
          while (true) {
            final Z t = x.pow(++k).multiply(mA.get(k)).getApprox(precision);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
        }
      };
    }
  }

  private class BigADerivative extends UnaryCrFunction {
    @Override
    public CR execute(final CR x) {
      return new CR() {
        @Override
        protected Z approximate(final int precision) {
          Z sum = Z.ZERO;
          int k = 0;
          while (true) {
            ++k;
            final Z t = x.pow(k - 1).multiply(mA.get(k)).multiply(k).getApprox(precision);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
        }
      };
    }
  }

  /** The rooted tree constant. */
  public CR alpha() {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        return new UnaryCrFunction() {
          @Override
          public CR execute(final CR c) {
            final BigA bigA = new BigA();
            final CR s = new CR() {
              @Override
              protected Z approximate(final int precision) {
                Z sum = Z.ZERO;
                int k = 1;
                while (true) {
                  ++k;
                  final Z t = bigA.execute(c.pow(-k)).divide(k).getApprox(precision);
                  if (t.isZero()) {
                    return sum;
                  }
                  sum = sum.add(t);
                }
              }
            };
            return c.log().subtract(s.add(CR.ONE));
          }
        }.inverseMonotone(CR.valueOf(2.9), CR.THREE).execute(CR.ZERO).getApprox(precision);
      }
    };
  }

  /** The unrooted tree constant. */
  public CR bConstant() {
    // b = sqrt((1 + sum(A_prime(alpha**-k) / alpha**k for k in range(2, max_n + 1))) / (2 * pi))
    final CR alpha = alpha();
    final BigADerivative bigA = new BigADerivative();
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = CR.ONE.getApprox(precision);
        int k = 1;
        while (true) {
          ++k;
          final Z t = bigA.execute(alpha.pow(-k)).divide(alpha.pow(k)).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.divide(CR.TAU).sqrt();
  }

  /** An unrooted tree constant. */
  public CR beta() {
    return bConstant().pow(3).multiply(CR.TAU);
  }

  /** An unrooted tree constant. */
  public CR gamma() {
    final CR alpha = alpha();
    return bConstant().multiply(alpha.sqrt()).multiply(CR.SQRT_PI).multiply(2);
  }
}
