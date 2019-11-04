package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022339 Index of <code>3^n</code> within sequence of numbers of form <code>3^i*5^j</code>.
 * @author Sean A. Irvine
 */
public class A022339 implements Sequence {

  private static final CR LOG = CR.THREE.log().divide(CR.FIVE.log());
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
