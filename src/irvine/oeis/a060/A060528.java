package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060528 A list of equal temperaments (equal divisions of the octave) whose nearest scale steps are closer and closer approximations to the ratios of two tones of musical harmony: the perfect 4th, 4/3 and its complement the perfect 5th, 3/2.
 * @author Sean A. Irvine
 */
public class A060528 extends Sequence1 {

  private static final CR V = CR.THREE.log().divide(CR.TWO.log());
  private static final int HEURISTIC_PRECISION = -100;
  private CR mD = CR.TWO;
  private long mDen = 0;

  @Override
  public Z next() {
    while (true) {
      final Z num = V.multiply(++mDen).round();
      final CR newD = V.subtract(CR.valueOf(new Q(num, mDen))).abs();
      if (newD.compareTo(mD, HEURISTIC_PRECISION) < 0) {
        mD = newD;
        return Z.valueOf(mDen);
      }
    }
  }
}
