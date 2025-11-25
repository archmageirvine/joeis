package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390796 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A390796 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z t = p.multiply(q).multiply(r).add(p).add(q).add(r).divide(4);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
