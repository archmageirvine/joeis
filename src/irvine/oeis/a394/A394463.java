package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394463 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A394463 extends Sequence1 {

  private long mN = 47;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prodE = Z.ONE;
    Z sumE = Z.ZERO;
    Z prodP = Z.ONE;
    Z sumP = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      prodP = prodP.multiply(p);
      sumP = sumP.add(p);
      final int e = fs.getExponent(p);
      prodE = prodE.multiply(e);
      sumE = sumE.add(e);
    }
    if (sumP.mod(sumE).isZero() || sumE.mod(sumP).isZero()) {
      return !prodP.mod(prodE).isZero() && !prodE.mod(prodP).isZero();
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
