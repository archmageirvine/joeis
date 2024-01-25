package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068070.
 * @author Sean A. Irvine
 */
public class A068070 extends Sequence0 {

  private static final CR ICSCH2 = ComputableReals.SINGLETON.acsch(CR.TWO);
  private static final CR LOG5 = CR.FIVE.log();
  private static final CR LOG100 = CR.valueOf(100).log();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.ONE;
    }
    mA = mA.multiply(10);
    return ICSCH2.multiply(mA).subtract(LOG5).divide(LOG100).ceil();
  }
}

