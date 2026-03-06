package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393807.
 * @author Sean A. Irvine
 */
public class A393799 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 1;
    long q = 2;
    long r = 3;
    while (true) {
      p = q;
      q = r;
      r = mPrime.nextPrime(r);
      if (r - q == mN && q - p == mN + 2) {
        return Z.valueOf(p);
      }
    }
  }
}
