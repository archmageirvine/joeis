package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024930 a(n) = sum of remainders of n mod 1,3,5,...,2k-1, where k = [ (n+1)/2 ].
 * @author Sean A. Irvine
 */
public class A024930 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; k += 2) {
      sum = sum.add(mN % k);
    }
    return sum;
  }
}
