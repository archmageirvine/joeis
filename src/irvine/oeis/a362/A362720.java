package irvine.oeis.a362;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A362720 allocated for Bill McEachen.
 * @author Sean A. Irvine
 */
public class A362720 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    long k = 1;
    long p = 2;
    long s = 2;
    while (!mB.add(s).isProbablePrime()) {
      p = mPrime.nextPrime(p);
      s += p;
      ++k;
    }
    mB = mB.add(s);
    return Z.valueOf(k);
  }
}
