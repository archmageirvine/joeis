package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059583 Each c(i) is "multiply" (*) or "divide" (/); a(n) is number of choices for c(1),..,c(n) so that 1 c(1) 2 c(2) 3 c(3) 5,.., c(n) n-th prime is " remainder = 1 ".
 * @author Sean A. Irvine
 */
public class A059583 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mCount = 0;

  private void search(final Q term, final long p) {
    if (p == mP) {
      final Z[] qr = term.num().divideAndRemainder(term.den());
      if (Z.ONE.equals(qr[1])) {
        ++mCount;
      }
      return;
    }
    final long q = mPrime.nextPrime(p);
    search(term.multiply(q), q);
    search(term.divide(q), q);
  }

  @Override
  public Z next() {
    mCount = 0;
    mP = mPrime.nextPrime(mP);
    search(Q.ONE, 1);
    return Z.valueOf(mCount);
  }
}
