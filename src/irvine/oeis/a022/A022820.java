package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A022820 [ n/1 ] - [ (n-1)/2 ] + [ (n-2)/3 ] - ... + ((-1)^n)[ 2/(n-1) ].
 * @author Sean A. Irvine
 */
public class A022820 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Z.valueOf((mN - k + 1) / k));
    }
    return sum;
  }
}
