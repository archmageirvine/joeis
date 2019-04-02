package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A006450 Prime-indexed primes: primes with prime subscripts.
 * @author Sean A. Irvine
 */
public class A006450 extends A000040 {

  private final Sequence mPrimes = new A000040();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p1 = mPrimes.next();
    while (true) {
      mN = mN.add(1);
      final Z p = super.next();
      if (p1.equals(mN)) {
        return p;
      }
    }
  }
}
