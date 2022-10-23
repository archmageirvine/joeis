package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007775 Numbers not divisible by 2, 3 or 5.
 * @author Sean A. Irvine
 */
public class A007775 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 3 != 0 && mN % 5 != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
