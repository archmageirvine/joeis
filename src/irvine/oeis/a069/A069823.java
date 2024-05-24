package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A069823 Nonprime numbers k such there is no x &lt; k such that phi(x) = phi(k).
 * @author Sean A. Irvine
 */
public class A069823 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (!mSeen.isSet(phi)) {
        mSeen.set(phi);
        if (!mPrime.isPrime(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

