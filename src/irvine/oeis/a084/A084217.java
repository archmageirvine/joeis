package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000367;

/**
 * A084217 Number of k's 1 &lt;= k &lt;= n dividing the numerator of 2n-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A084217 extends Sequence1 {

  private final Sequence mS = new A000367().skip();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z b = mS.next();
    long cnt = 1;
    for (long k = 2; k <= mN; ++k) {
      if (b.mod(k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
