package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A053708 Nearest prime to n! (but not equal to n!).
 * @author Sean A. Irvine
 */
public class A053708 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    final Z f = super.next();
    if (Z.ONE.equals(f)) {
      return Z.TWO;
    }
    final Z p = mPrime.prevPrime(f);
    final Z n = mPrime.nextPrime(f);
    if (f.subtract(p).compareTo(n.subtract(f)) <= 0) {
      return p;
    } else {
      return n;
    }
  }
}
