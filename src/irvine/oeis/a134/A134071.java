package irvine.oeis.a134;

import irvine.math.z.Z;

/**
 * A134071 Primes in <code>A134072</code>.
 * @author Sean A. Irvine
 */
public class A134071 extends A134072 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}

