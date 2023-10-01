package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066064 a(n) = p.q in decimal notation where p = prime(n) and q is the smallest prime (A066065(n)) such that the concatenation p.q is a prime.
 * @author Sean A. Irvine
 */
public class A066064 extends A000040 {

  @Override
  public Z next() {
    final String p = super.next().toString();
    long q = 2;
    while (true) {
      q = mPrime.nextPrime(q);
      final Z t = new Z(p + q);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
