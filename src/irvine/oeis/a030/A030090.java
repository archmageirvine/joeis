package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030090 Primes such that digits of p do not appear in <code>p^2</code> or <code>p^3</code> (probably finite).
 * @author Sean A. Irvine
 */
public class A030090 extends A030086 {

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
