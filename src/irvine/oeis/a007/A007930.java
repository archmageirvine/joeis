package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007930 Some nontrivial permutation of digits gives an even number.
 * @author Sean A. Irvine
 */
public class A007930 extends Sequence1 {

  // After M. F. Hasler

  private long mN = 19;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 99 && (mN & 1) == 0) {
        return Z.valueOf(mN);
      }
      long m = mN / 10;
      while (m != 0) {
        if ((m & 1) == 0) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
