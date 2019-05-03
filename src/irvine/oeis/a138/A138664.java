package irvine.oeis.a138;

import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A138664 <code>a(n) =</code> number of positive integers k, k <code>&lt;=</code> n, where the number of one's in the binary representation of each k divides n.
 * @author Sean A. Irvine
 */
public class A138664 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 1;
    for (long k = 2; k <= mN; ++k) {
      if (mN % PopCount.popcount(k) == 0) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

