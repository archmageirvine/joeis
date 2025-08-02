package irvine.oeis.a380;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A380446 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A380446 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mS = new A001597().skip();

  private boolean is(final Z n) {
    Z m = n.makeOdd();
    if (m.auxiliary() == 0) {
      return false;
    }
    long p = 2;
    while (!m.isOne()) {
      p = mPrime.nextPrime(p);
      if (m.mod(p) != 0) {
        return false;
      }
      do {
        m = m.divide(p);
      } while (m.mod(p) == 0);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = mS.next();
      if (Functions.OMEGA.i(n) > 1 && is(n)) {
        return n;
      }
    }
  }
}
