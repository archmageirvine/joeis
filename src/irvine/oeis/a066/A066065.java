package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066065 a(n) = smallest prime q such that in decimal notation the concatenation prime(n)q yields a prime ( = A066064(n)).
 * @author Sean A. Irvine
 */
public class A066065 extends A000040 {

  @Override
  public Z next() {
    final String p = super.next().toString();
    long q = 2;
    while (true) {
      q = mPrime.nextPrime(q);
      if (new Z(p + q).isProbablePrime()) {
        return Z.valueOf(q);
      }
    }
  }
}
