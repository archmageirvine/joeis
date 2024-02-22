package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068524 a(1) = 2; for n &gt; 1, a(n) = largest prime not exceeding a(1) + ... + a(n-1).
 * @author Sean A. Irvine
 */
public class A068524 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.TWO;
      return Z.TWO;
    }
    final Z p = mPrime.prevPrime(mSum.add(1));
    mSum = mSum.add(p);
    return p;
  }
}

