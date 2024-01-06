package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A067677 Diagonals of the prime-composite array, B(m,n) which are zeros from the Second Borve Conjecture.
 * @author Sean A. Irvine
 */
public class A067677 extends Sequence1 {

  private final Sequence mComposites = new A002808();
  protected final Fast mPrime = new Fast();
  private long mN = 0;

  protected boolean is(long c) {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p > c) {
        return true;
      }
      if (c % p == 0) {
        return false;
      }
      while (mPrime.isPrime(++c)) {
        // do nothing
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (is(mComposites.next().longValueExact())) {
        return Z.valueOf(mN);
      }
    }
  }
}
