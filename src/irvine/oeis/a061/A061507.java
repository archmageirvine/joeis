package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061507 Numbers with all odd digits, in which each digit divides the number formed by the rest, i.e., the number obtained by just removing this digit.
 * @author Sean A. Irvine
 */
public class A061507 extends Sequence1 {

  private long mN = 4;
  private long mLim = 10;

  private boolean is(final StringBuilder sb) {
    if (sb.length() <= 1) {
      return true;
    }
    for (int k = 0; k < sb.length(); ++k) {
      final int d = sb.charAt(k) - '0';
      if (new Z(sb.substring(0, k) + sb.substring(k + 1)).mod(d) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 5;
        mN = mLim / 2;
      }
      long m = mN;
      final StringBuilder sb = new StringBuilder();
      do {
        sb.insert(0, 2 * (m % 5) + 1);
        m /= 5;
      } while (m >= 5);
      if (is(sb)) {
        return new Z(sb);
      }
    }
  }
}

