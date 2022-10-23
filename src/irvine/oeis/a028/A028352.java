package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028352 A Golomb-like recurrence that decreases infinitely often.
 * @author Sean A. Irvine
 */
public class A028352 extends Sequence1 {

  private static final CR LOG_THREE = CR.THREE.log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final Z power = CR.valueOf(new Q(mN, 2)).log().divide(LOG_THREE).floor();
    return Z.THREE.pow(power).multiply(12).subtract(2 * mN);
  }
}
