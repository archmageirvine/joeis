package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080174 Primes prime(k) such that prime(k)*k falls between twin primes.
 * @author Sean A. Irvine
 */
public class A080174 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.multiply(++mN);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

