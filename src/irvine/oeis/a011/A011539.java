package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011539 "9ish numbers": decimal representation contains at least one nine.
 * @author Sean A. Irvine
 */
public class A011539 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 9) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
