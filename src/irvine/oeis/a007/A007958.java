package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007958.
 * @author Sean A. Irvine
 */
public class A007958 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      long m = mN / 10; // last digit always even
      while (m != 0) {
        if ((m & 1) == 1) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
