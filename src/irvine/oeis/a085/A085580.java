package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389808.
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
