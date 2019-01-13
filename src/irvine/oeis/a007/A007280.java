package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A007280.
 * @author Sean A. Irvine
 */
public class A007280 implements Sequence {

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
