package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030085 Primes p such that digits of p appear in p^2 and p^3.
 * @author Sean A. Irvine
 */
public class A030085 extends A030079 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
