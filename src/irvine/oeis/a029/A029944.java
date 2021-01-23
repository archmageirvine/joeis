package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029944 a(n)^2 contains n-th prime as a substring.
 * @author Sean A. Irvine
 */
public class A029944 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    Z t = Z.THREE;
    while (true) {
      t = t.add(1);
      if (t.square().toString().contains(s)) {
        return t;
      }
    }
  }
}
