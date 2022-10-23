package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065413 Number of positive solutions to "numbers that are n times their number of binary 1's".
 * @author Sean A. Irvine
 */
public class A065413 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long cnt = 0;
    int bgds = 0;
    while (true) {
      ++bgds;
      final Z x = n.multiply(bgds);
      // x must have bdgs bits set, so x =bdgs*n >= 2^bdgs-1.
      if (n.multiply(x).compareTo(Z.ONE.shiftLeft(bgds).subtract(1)) < 0) {
        break;
      }
      if (x.bitCount() == bgds) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
