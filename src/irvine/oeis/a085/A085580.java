package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085580 a(n) = (n+1)-st digit after decimal point of d, where d = (sqrt((n+1)^2 + 4(n+1)) - (n+1))/2.
 * @author Sean A. Irvine
 */
public class A085580 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    return CR.valueOf(Z.valueOf(++mN).square().add(4 * mN)).sqrt().subtract(mN).divide(2).multiply(mT).floor().mod(Z.TEN);
  }
}
