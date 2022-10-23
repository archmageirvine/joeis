package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011532 Numbers that contain a 2.
 * @author Sean A. Irvine
 */
public class A011532 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 2) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
