package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A064553 <code>a(1) = 1,</code> a(prime(i)) = i <code>+ 1</code> for i <code>&gt; 0</code> and a(u * v) = a(u) * a(v) for u, v <code>&gt; 0</code>; prime = A000040.
 * @author Sean A. Irvine
 */
public class A064553 implements Sequence {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mSeq = new DynamicLongArray();
  private int mN = 0;
  private long mPrimeIndex = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      mSeq.set(mN, 1L);
    } else if (mPrime.isPrime(mN)) {
      mSeq.set(mN, ++mPrimeIndex);
    } else {
      // Find least prime factor of mN (must exist because of previous check)
      int d = 2;
      while (mN % d != 0) {
        ++d;
      }
      mSeq.set(mN, mSeq.get(d) * mSeq.get(mN / d));
    }
    return Z.valueOf(mSeq.get(mN));
  }
}
