package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077693 Smallest triangular number which begins with the concatenation of n times digits of n.
 * @author Sean A. Irvine
 */
public class A077693 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z m = new Z(String.valueOf(++mN).repeat(mN));
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
