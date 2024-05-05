package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069576 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long q = 2;
    int pop = 1;
    while (true) {
      final long p = q;
      final int pp = pop;
      q = mPrime.nextPrime(q);
      pop = Long.bitCount(q);
      if (pop - pp == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
