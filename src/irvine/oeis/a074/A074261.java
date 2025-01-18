package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074256.
 * @author Sean A. Irvine
 */
public class A074261 extends A000002 {

  private long mN = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum += super.next().equals(Z.TWO) ? 1 : -1;
      if (mSum > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
