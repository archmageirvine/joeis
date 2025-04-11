package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076643 Positive integers read backwards, but omit a number if it is &lt;= an earlier number.
 * @author Sean A. Irvine
 */
public class A076643 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z r = Functions.REVERSE.z(++mN);
      if (r.compareTo(mPrev) > 0) {
        mPrev = r;
        return r;
      }
    }
  }
}
