package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011545 Decimal expansion of <code>Pi</code> truncated to n places.
 * @author Sean A. Irvine
 */
public class A011545 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PI.multiply(CR.valueOf(mA)).floor();
  }
}
