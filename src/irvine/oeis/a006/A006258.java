package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006258.
 * @author Sean A. Irvine
 */
public class A006258 implements Sequence {

  private CR mAlpha = null;
  private Z mA00 = Z.ONE;
  private Z mA01 = Z.ZERO;
  private Z mA10 = Z.ZERO;
  private Z mA11 = Z.ONE;

  protected Z toZ(final Q fraction) {
    return fraction.num();
  }

  @Override
  public Z next() {
    if (mAlpha == null) {
      mAlpha = CR.E;
    } else if (mAlpha.compareTo(CR.ONE) < 0) {
      mAlpha = mAlpha.divide(CR.ONE.subtract(mAlpha));
      mA01 = mA01.add(mA00);
      mA11 = mA10.add(mA11);
    } else {
      mAlpha = mAlpha.subtract(CR.ONE);
      mA00 = mA00.add(mA01);
      mA10 = mA10.add(mA11);
    }
    return toZ(new Q(mA10.add(mA11), mA00.add(mA01)));
  }
}
