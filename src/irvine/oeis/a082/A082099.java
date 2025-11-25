package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;

/**
 * A082099 a(n) is the smallest prime p of the form 4k+1 such that nextprime(p) - p = 4n.
 * @author Sean A. Irvine
 */
public class A082099 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    final Sequence s = new A002144();
    while (true) {
      final Z p = s.next();
      if (mPrime.nextPrime(p).subtract(p).equals(mN)) {
        return p;
      }
    }
  }
}
