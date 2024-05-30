package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020495 Neither square nor square + prime.
 * @author Sean A. Irvine
 */
public class A020495 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 9;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      final long s = Functions.SQRT.l(mN);
      if (s * s != mN) {
        for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
          final long t = mN - p;
          final long r = Functions.SQRT.l(t);
          if (r * r == t) {
            continue outer;
          }
        }
        return Z.valueOf(mN);
      }
    }
  }
}
