package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138664 a(n) = number of positive integers k, k &lt;= n, where the number of one's in the binary representation of each k divides n.
 * @author Sean A. Irvine
 */
public class A138664 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 1;
    for (long k = 2; k <= mN; ++k) {
      if (mN % (long) Long.bitCount(k) == 0) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

