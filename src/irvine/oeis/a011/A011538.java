package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011538 Numbers that contain an 8.
 * @author Sean A. Irvine
 */
public class A011538 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 8) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
