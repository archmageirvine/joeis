package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073871 A073870 divided by n.
 * @author Sean A. Irvine
 */
public class A073871 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mN = 0;
  {
    mUsed.add(1L);
  }

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (mPrime.isPrime(k) || !mUsed.add(k)) {
      k += mN;
    }
    return Z.valueOf(k / mN);
  }
}
