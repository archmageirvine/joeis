package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.z.Z;

/**
 * Generalized infinitary sigma0 function.
 * @author Sean A. Irvine
 */
class InfinitarySigma0 extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 1;
  }

  private static Z infinitarySigma0(final Z n) {
    return Z.valueOf(InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(n)).size());
  }

  @Override
  public Z z(final long base, final Z n) {
    if (base <= 1) {
      return infinitarySigma0(n);
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      int e = fs.getExponent(p);
      Z k = Z.ONE;
      while (e != 0) {
        prod = prod.multiply(e % base + 1);
        k = k.multiply(base);
        e /= base;
      }
    }
    return prod;
  }
}
