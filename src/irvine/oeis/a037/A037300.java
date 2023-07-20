package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.prime.HomePrimeSequence;
import irvine.oeis.a002.A002808;

/**
 * A037300 Number of prime substrings of prime numbers in A037272.
 * @author Sean A. Irvine
 */
public class A037300 extends A002808 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z n = super.next();
    final HomePrimeSequence hp = new HomePrimeSequence(n.longValueExact());
    Z r = null;
    Z p = null;
    Z q;
    while ((q = hp.next()) != null) {
      r = p;
      p = q;
    }
    return Z.valueOf(Jaguar.factor(r).bigOmega());
  }
}

