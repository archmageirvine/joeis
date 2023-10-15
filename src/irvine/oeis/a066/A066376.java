package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066376 Number of [*]-divisors d &lt;= n such that there is another [*]-divisor d' &lt; n with d [*] d' = n.
 * @author Sean A. Irvine
 */
public class A066376 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long a = 1; a <= mN; ++a) {
      for (long b = 1; b < mN; ++b) {
        if (LongUtils.numbralMultiply(a, b) == mN) {
          ++cnt;
          break;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
