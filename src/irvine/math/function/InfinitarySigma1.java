package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.z.Z;

/**
 * Generalized infinitary sigma function.
 * @author Sean A. Irvine
 */
class InfinitarySigma1 extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 1;
  }

  private static Z infinitarySigma(final Z n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z d : InfinitaryAliquotSequence.infinitaryDivisors(fs)) {
      sum = sum.add(d);
    }
    return sum.subtract(n);
  }

  @Override
  public Z z(final long base, final Z n) {
    if (base == 1) {
      return infinitarySigma(n);
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      int e = fs.getExponent(p);
      Z k = Z.ONE;
      while (e != 0) {
        prod = prod.multiply(p.pow(k.multiply(e % base + 1)).subtract(1).divide(p.pow(k).subtract(1)));
        k = k.multiply(base);
        e /= base;
      }
    }
    return prod;
  }
}
