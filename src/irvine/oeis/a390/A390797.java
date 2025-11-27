package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390797 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A390797 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z t = p.multiply(q).multiply(r).subtract(p).subtract(q).subtract(r).divide2();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
