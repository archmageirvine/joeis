package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048153 a(n) = Sum_{k=1..n} (k^2 mod n).
 * @author Sean A. Irvine
 */
public class A048153 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(LongUtils.modPow(k, 2, mN));
    }
    return sum;
  }
}

