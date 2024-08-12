package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030093 Primes p such that p, p^2 and p^3 all have the same set of digits.
 * @author Sean A. Irvine
 */
public class A030093 extends A030091 {

  {
    setOffset(0);
  }

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
