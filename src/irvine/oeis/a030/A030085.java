package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030085 Primes p such that digits of p appear in <code>p^2</code> and <code>p^3</code>.
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
