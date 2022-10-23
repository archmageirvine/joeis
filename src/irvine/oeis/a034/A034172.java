package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034172 Nearest integer to n!/(2*log(2)^(n+1)).
 * @author Sean A. Irvine
 */
public class A034172 extends Sequence0 {

  private static final CR LOG2 = CR.TWO.log();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return CR.valueOf(mF).divide(CR.TWO).divide(ComputableReals.SINGLETON.pow(LOG2, mN + 1)).round();
  }
}

