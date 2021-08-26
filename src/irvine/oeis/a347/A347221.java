package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A347221 allocated for Vo Hoang Anh.
 * @author Sean A. Irvine
 */
public class A347221 implements Sequence {

  private int mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(Zeta.zeta(++mN));
    return mSum.floor();
  }
}
