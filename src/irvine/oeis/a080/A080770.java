package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080770 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z f1 = mF;
    mF = mF.multiply(++mN);
    return CR.E.multiply(mF).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).floor().subtract(CR.E.multiply(f1).floor().multiply(mN + 3).multiply(mN + 2).multiply(mN + 1).multiply(mN));
  }
}
