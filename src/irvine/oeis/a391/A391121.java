package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391121 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A391121 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z prod = p.multiply(q).multiply(r).multiply(s);
      final Z sum = p.add(q).add(r).add(s);
      final Z s2 = sum.square();
      if (s2.subtract(prod).abs().isProbablePrime() && s2.add(prod).isProbablePrime()) {
        return p;
      }
    }
  }
}
