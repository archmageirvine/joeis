package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072300 Number of positive integers not exceeding n that are relatively prime to reverse(n).
 * @author Sean A. Irvine
 */
public class A072300 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = Functions.REVERSE.l(++mN);
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(r, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

