package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029947 Smallest cube containing n-th prime as substring.
 * @author Sean A. Irvine
 */
public class A029947 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    Z t = Z.TWO;
    while (true) {
      t = t.add(1);
      final Z t3 = t.pow(3);
      if (t3.toString().contains(s)) {
        return t3;
      }
    }
  }
}
