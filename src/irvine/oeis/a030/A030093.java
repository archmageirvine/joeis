package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030093 Primes such that p, <code>p^2</code> and <code>p^3</code> have same digits.
 * @author Sean A. Irvine
 */
public class A030093 extends A030091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030091.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
