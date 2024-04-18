package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A066732 Least k such that the least factor of k^Phi(k) -1 is the n-th prime.
 * @author Sean A. Irvine
 */
public class A066732 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 2;
    while (true) {
      final long v = mLeast.get(++k);
      if (v == mP) {
        return Z.valueOf(k);
      }
      if (v == 0) {
        final Z phi = Functions.PHI.z(k);
        final Z zk = Z.valueOf(k);
        long p = 1;
        while (true) {
          p = mPrime.nextPrime(p);
          if (zk.modPow(phi, Z.valueOf(p)).equals(Z.ONE)) {
            mLeast.set(k, p);
            if (p == mP) {
              return Z.valueOf(k);
            }
            break;
          }
        }
      }
    }
  }
}
