package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022821 [ (n+1)/(n-1) ] + [ (n+2)/(n-2) ] + ... + [ (2n-1)/1 ].
 * @author Sean A. Irvine
 */
public class A022821 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add((2 * mN - k) / k);
    }
    return sum;
  }
}
