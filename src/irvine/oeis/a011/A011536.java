package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011536 Numbers that contain a 6.
 * @author Sean A. Irvine
 */
public class A011536 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 6) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
