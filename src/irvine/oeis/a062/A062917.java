package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062917 Nonpalindromic numbers k such that k is not divisible by 10 and k*R(k) is a square, where R(k) is the reversal of k (A004086).
 * @author Sean A. Irvine
 */
public class A062917 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0) {
        final long r = LongUtils.reverse(mN);
        if (r != mN && Z.valueOf(mN).multiply(r).isSquare()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

