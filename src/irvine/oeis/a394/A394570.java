package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394095.
 * @author Sean A. Irvine
 */
public class A394570 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 1; r < mN; ++r) {
      long k = 1;
      while (true) {
        final Z n = Z.valueOf(r).pow(k);
        if (Functions.DIGIT_LENGTH.l(mN, n) < k) {
          break;
        }
        if (n.subtract(1).mod(mN - 1) + 1 == r) {
          ++cnt;
        }
        ++k;
      }
    }
    return Z.valueOf(cnt);
  }
}
