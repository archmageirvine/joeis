package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068373 extends Sequence1 {

  private final Fast mFast = new Fast();
  private final Sequence mSquares = new A000290().skip(2);

  private boolean is(final long n) {
    for (int k = 1; A068372.PRIMORIALS[k] < n; ++k) {
      if (!mFast.isPrime(n - A068372.PRIMORIALS[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      if (is(s.longValueExact())) {
        return s;
      }
    }
  }
}
