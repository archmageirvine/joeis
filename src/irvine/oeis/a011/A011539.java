package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011539.
 * @author Sean A. Irvine
 */
public class A011539 implements Sequence {

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
