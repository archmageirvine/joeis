package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A077692 Smallest triangular number which begins with the concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A077692 extends A007908 {

  @Override
  public Z next() {
    final Z m = super.next();
    Z tens = null;
    while (true) {
      tens = tens == null ? Z.ONE : tens.multiply(10);
      final Z u = m.multiply(tens);
      final Z inv = Functions.TRINV.z(u);
      Z t = Functions.TRIANGULAR.z(inv);
      if (t.compareTo(u) < 0) {
        t = Functions.TRIANGULAR.z(inv.add(1));
      }
      if (t.compareTo(m.add(1).multiply(tens)) < 0) {
        return t;
      }
    }
  }
}
