package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a064.A064771;

/**
 * A065235 Odd numbers which can be written in precisely one way as sum of a subset of their proper divisors.
 * @author Sean A. Irvine
 */
public class A065235 extends A064771 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
