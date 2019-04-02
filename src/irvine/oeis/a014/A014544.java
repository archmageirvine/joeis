package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014544 Numbers n such that a cube can be divided into n sub-cubes.
 * @author Sean A. Irvine
 */
public class A014544 implements Sequence {

  private static final int[] SMALL = {1, 8, 15, 20, 22, 27, 29, 34, 36, 38, 39, 41, 43, 45, 46};

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      if (mN == SMALL.length) {
        mN = 48;
      } else {
        return Z.valueOf(SMALL[(int) mN]);
      }
    }
    return Z.valueOf(mN);
  }
}
