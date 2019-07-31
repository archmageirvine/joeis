package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024930 <code>a(n) =</code> sum of remainders of <code>n mod 1,3,5,...,2k-1</code>, where k <code>= [ (n+1)/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A024930 implements Sequence {

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
