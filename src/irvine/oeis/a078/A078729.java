package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078729 a(n) = the least positive integer k such that (k+1)*(k+2)*...*(k+n) + 1 is prime, if such k exists; otherwise, = 0.
 * @author Sean A. Irvine
 */
public class A078729 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 4) {
      return Z.ZERO;
    }
    long k = 0;
    Z prod = Z.ONE;
    for (long j = 2; j <= mN; ++j) {
      prod = prod.multiply(j);
    }
    while (true) {
      prod = prod.divide(++k).multiply(mN + k);
      if (prod.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
