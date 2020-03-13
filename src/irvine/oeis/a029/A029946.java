package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029946 <code>a(n)^3</code> contains n-th prime as a substring.
 * @author Sean A. Irvine
 */
public class A029946 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    Z t = Z.TWO;
    while (true) {
      t = t.add(1);
      if (t.pow(3).toString().contains(s)) {
        return t;
      }
    }
  }
}
