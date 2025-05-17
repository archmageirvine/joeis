package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077352 a(n) = (concatenation in ascending order of divisors of 2^n)/2^n.
 * @author Sean A. Irvine
 */
public class A077352 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = Z.TWO.pow(mN);
      mA = mA.shiftLeft(mN - 1).multiply(Z.TEN.pow(Functions.DIGIT_LENGTH.l(t))).add(t).divide(t);
    }
    return mA;
  }
}
