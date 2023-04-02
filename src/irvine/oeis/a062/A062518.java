package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062518 extends Sequence0 {

  private static final int HEURISTIC = 100;
  private long mN = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10;
      return Z.ZERO; // powers of 10 are 0
    }
    long prevMax = 0;
    long k = 0;
    Z nk = Z.ONE;
    while (prevMax + HEURISTIC >= k) {
      ++k;
      nk = nk.multiply(mN);
      if (ZUtils.syn(nk) != 0b1111111111) {
        prevMax = k;
      }
    }
    return Z.valueOf(prevMax);
  }
}
