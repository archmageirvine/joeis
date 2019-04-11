package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007929 Odd numbers containing <code>an</code> even digit.
 * @author Sean A. Irvine
 */
public class A007929 implements Sequence {

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
