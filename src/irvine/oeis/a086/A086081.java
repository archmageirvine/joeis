package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086081 Numbers m such that m and its 2's complement are both primes. In other words, m and 2^k - m (where k is the smallest power of 2 such that 2^k &gt; m) are primes.
 * @author Sean A. Irvine
 */
public class A086081 extends A000040 {

  private Z mT = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mT) >= 0) {
        mT = mT.multiply2();
      }
      if (mT.subtract(p).isProbablePrime()) {
        return p;
      }
    }
  }
}
