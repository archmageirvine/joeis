package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011546.
 * @author Sean A. Irvine
 */
public class A011546 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PI.multiply(CR.valueOf(mA)).add(CR.HALF).floor(32);
  }
}
