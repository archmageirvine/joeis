package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039700 Numbers k such that the largest power of 3 dividing k equals 3^omega(k).
 * @author Sean A. Irvine
 */
public class A039700 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.ONE;
    }
    while (true) {
      mN += 3;
      long m = mN / 3;
      long c = 1;
      while (m % 3 == 0) {
        ++c;
        m /= 3;
      }
      if (Functions.OMEGA.i(mN) == c) {
        return Z.valueOf(mN);
      }
    }
  }
}
