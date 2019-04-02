package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011540 Numbers that contain a digit 0.
 * @author Sean A. Irvine
 */
public class A011540 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 0) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
