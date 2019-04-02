package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011537 Numbers that contain at least one 7.
 * @author Sean A. Irvine
 */
public class A011537 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 7) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
