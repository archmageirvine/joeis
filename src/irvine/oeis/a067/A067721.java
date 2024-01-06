package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067721 Least number k such that k (k + n) is a perfect square, or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A067721 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 2 || mN == 4) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (Z.valueOf(mN + ++k).multiply(k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
