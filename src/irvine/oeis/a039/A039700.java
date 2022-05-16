package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039700 Numbers k such that the largest power of 3 dividing k equals 3^omega(k).
 * @author Sean A. Irvine
 */
public class A039700 implements Sequence {

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
      if (Jaguar.factor(mN).omega() == c) {
        return Z.valueOf(mN);
      }
    }
  }
}
