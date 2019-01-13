package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014885.
 * @author Sean A. Irvine
 */
public class A014885 implements Sequence {

  private long mC = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if ((m & 7) == 1) {
          ++mC;
        }
        m >>>= 3;
      }
      if (mC == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
