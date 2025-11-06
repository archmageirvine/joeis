package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081651 a(n) = floor((3/2)^^n), where x^^n is the power tower x^(x^(...^x)) with n x's.
 * @author Sean A. Irvine
 */
public class A081651 extends Sequence0 {

  private static final CR CONST = CR.valueOf(new Q(3, 2));
  private CR mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = CR.ONE;
    } else {
      mA = CONST.pow(mA);
    }
    return mA.floor();
  }
}
