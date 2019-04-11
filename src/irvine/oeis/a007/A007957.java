package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007957 Numbers that contain an odd digit.
 * @author Sean A. Irvine
 */
public class A007957 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if ((m & 1) == 1) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
