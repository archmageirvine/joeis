package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394570 Number of integers of the form r^k (with 0 &lt; r &lt; n and k &gt; 0) whose base n digital root is r, and whose number of digits in base n is k.
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
