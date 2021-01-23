package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022331 Index of 2^n within sequence of numbers of form 2^i*3^j.
 * @author Sean A. Irvine
 */
public class A022331 implements Sequence {

  private static final CR LOG = CR.TWO.log().divide(CR.THREE.log());
  private long mN = -1;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mS = mS.add(LOG.multiply(mN).ceil());
    }
    return mS;
  }
}
