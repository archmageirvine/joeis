package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383252 Numbers that cannot be written in the form (j+2k)^2-(j+k)^2-j^2 with j,k&gt;0.
 * @author Sean A. Irvine
 */
public class A383252 extends Sequence1 {

  private static final long[] ADD = {3, 1, 3, 1, 2, 1, 1, 3, 1};
  private Z mA = Z.valueOf(-2);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= ADD.length) {
      mN = 0;
    }
    mA = mA.add(ADD[mN]);
    return mA;
  }
}

