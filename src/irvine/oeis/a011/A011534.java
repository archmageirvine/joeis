package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011534 Numbers that contain a 4.
 * @author Sean A. Irvine
 */
public class A011534 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 4) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
