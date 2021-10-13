package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a001.A001097;

/**
 * A051859 Values of C (the hypotenuse) of a Pythagorean triangle with A (the short leg) and C both prime and part of a twin prime.
 * @author Sean A. Irvine
 */
public class A051859 extends A001097 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final Z u = a.add(1).divide2();
      final Z c = u.square().multiply(2).subtract(u.multiply(2)).add(1);
      if (c.isProbablePrime() && (c.add(2).isProbablePrime() || c.subtract(2).isProbablePrime())) {
        final Z b = u.multiply(2).multiply(u.subtract(1));
        if (a.square().add(b.square()).equals(c.square())) {
          return c;
        }
      }
    }
  }
}
