package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051697 Closest prime to n (break ties by taking the smaller prime).
 * @author Sean A. Irvine
 */
public class A051697 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    final long prev = mPrime.prevPrime(mN);
    final long next = mPrime.nextPrime(mN);
    if (prev <= 0 || next - mN < mN - prev) {
      return Z.valueOf(next);
    } else {
      return Z.valueOf(prev);
    }
  }
}
