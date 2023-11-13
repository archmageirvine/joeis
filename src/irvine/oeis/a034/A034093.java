package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034093 Number of near-repunit primes that can be formed from (10^k - 1)/9 by changing just one digit from 1 to 0.
 * @author Sean A. Irvine
 */
public class A034093 extends Sequence1 {

  private Z mT = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT = mT.multiply(10);
    final Z t = mT.divide(9);
    long cnt = 0;
    Z u = Z.TEN;
    for (int k = 1; k < mN; ++k, u = u.multiply(10)) {
      if (t.subtract(u).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

