package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077018 Closest prime to n (break ties by taking the larger prime).
 * @author Sean A. Irvine
 */
public class A077018 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    final long prev = mPrime.prevPrime(mN);
    final long next = mPrime.nextPrime(mN);
    if (prev <= 0 || next - mN <= mN - prev) {
      return Z.valueOf(next);
    } else {
      return Z.valueOf(prev);
    }
  }
}
