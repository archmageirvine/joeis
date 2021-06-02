package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048155 a(n)=Sum{T(n,k): k=1,2,...,n}, array T as in A048154.
 * @author Sean A. Irvine
 */
public class A048155 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(LongUtils.modPow(k, 3, mN));
    }
    return sum;
  }
}

