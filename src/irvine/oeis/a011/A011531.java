package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011531 Numbers that contain a digit 1 in their decimal representation.
 * @author Sean A. Irvine
 */
public class A011531 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 1) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
