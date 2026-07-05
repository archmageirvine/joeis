package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085579 a(n) is the n-th digit after the decimal point of the positive real root of x^2+n*x-2.
 * @author Sean A. Irvine
 */
public class A085579 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    if (++mN == 1) {
      return Z.NINE;
    }
    return CR.valueOf(Z.valueOf(mN).square().add(8)).sqrt().subtract(mN).divide(2).multiply(mT).floor().mod(Z.TEN);
  }
}
