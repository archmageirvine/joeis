package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011533 Numbers that contain a 3.
 * @author Sean A. Irvine
 */
public class A011533 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 3) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
