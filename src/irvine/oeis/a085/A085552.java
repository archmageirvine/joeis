package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085552 The n-th digit after decimal point of (sqrt(n^2+4)-n)/2.
 * @author Sean A. Irvine
 */
public class A085552 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mT = mT.multiply(10);
    return CR.valueOf(mN * mN + 4).sqrt().subtract(mN).divide(2).multiply(mT).floor().mod(Z.TEN);
  }
}
