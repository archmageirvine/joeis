package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051698 Closest prime to n that is different from n (break ties by taking the smaller prime).
 * @author Sean A. Irvine
 */
public class A051698 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final long prev = mPrime.prevPrime(++mN);
    final long next = mPrime.nextPrime(mN);
    if (prev <= 0 || next - mN < mN - prev) {
      return Z.valueOf(next);
    } else {
      return Z.valueOf(prev);
    }
  }
}
