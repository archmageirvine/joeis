package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008284;

/**
 * A007280 Multiplicative encoding of partition triangle.
 * @author Sean A. Irvine
 */
public class A007280 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final A008284 mPartitions = new A008284();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(mPartitions.next()));
    }
    return prod;
  }
}
