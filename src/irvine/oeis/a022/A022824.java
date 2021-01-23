package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022824 a(n) = [ (2n+2)/(n-1) ] + [ (2n+4)/(n-2) ] + ... + [ (4n-2)/1 ].
 * @author Sean A. Irvine
 */
public class A022824 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add((4 * mN - 2 * k) / k);
    }
    return sum;
  }
}
