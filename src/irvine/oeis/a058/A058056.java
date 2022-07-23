package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A058056 a(n) = p is the smallest prime such that p = n + h(n)^2 and p is the first prime following h(n)^2. The smallest immediate post-square primes with distance n = p - h(n)^2.
 * @author Sean A. Irvine
 */
public class A058056 implements Sequence {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      mM = mM.add(1);
      final Z m2 = mM.square();
      final Z p = mPrime.nextPrime(m2);
      final int t = p.subtract(m2).intValueExact();
      if (mA.get(t) == null) {
        mA.set(t, p);
      }
    }
    return mA.get(mN);
  }
}
