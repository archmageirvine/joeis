package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077353 a(n) = (concatenation in ascending order of divisors of 5^n)/5^n.
 * @author Sean A. Irvine
 */
public class A077353 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.TEN.pow(Functions.DIGIT_LENGTH.l(Z.FIVE.pow(mN)))).divide(5).add(1);
    }
    return mA;
  }
}
