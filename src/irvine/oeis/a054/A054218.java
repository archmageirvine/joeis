package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A054218 Palindromic primes of the form 'primemirp' resulting from A054217.
 * @author Sean A. Irvine
 */
public class A054218 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z r = ZUtils.reverse(p);
      final Z t;
      if (mPrime.isPrime(r) && (t = new Z(p.toString() + r.toString().substring(1))).isProbablePrime()) {
        return t;
      }
    }
  }
}

