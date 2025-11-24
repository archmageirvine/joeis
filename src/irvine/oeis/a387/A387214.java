package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387214 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A387214 extends Sequence0 {

  private static final CR SLOPE = CR.THREE.log().divide(CR.LOG2).subtract(1);
  private Z mX = Z.ONE;
  private Z mY = null;

  @Override
  public Z next() {
    if (mY == null) {
      mY = Z.ZERO;
      return Z.ZERO;
    }
    if (CR.valueOf(new Q(mY.add(1), mX)).subtract(SLOPE).signum() > 0) {
      mX = mX.add(1);
      return Z.ZERO;
    } else {
      mY = mY.add(1);
      return Z.ONE;
    }
  }
}
