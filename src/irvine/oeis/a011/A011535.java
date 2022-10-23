package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011535 Numbers that contain a 5.
 * @author Sean A. Irvine
 */
public class A011535 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 5) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
