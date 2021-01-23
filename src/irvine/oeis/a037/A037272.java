package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.HomePrimeSequence;
import irvine.oeis.a002.A002808;

/**
 * A037272 Primes reached in A037271, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A037272 extends A002808 {

  @Override
  public Z next() {
    final Z n = super.next();
    final HomePrimeSequence hp = new HomePrimeSequence(n.longValueExact());
    Z p = null;
    Z q;
    while ((q = hp.next()) != null) {
      p = q;
    }
    return p;
  }
}

