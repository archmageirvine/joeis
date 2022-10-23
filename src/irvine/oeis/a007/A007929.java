package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007929 Odd numbers containing an even digit.
 * @author Sean A. Irvine
 */
public class A007929 extends Sequence1 {

  private long mN = 19;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      long m = mN / 10; // lowest digit is always odd
      do {
        if ((m & 1) == 0) {
          return Z.valueOf(mN);
        }
        m /= 10;
      } while (m != 0);
    }
  }
}
