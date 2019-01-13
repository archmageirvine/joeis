package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A015050.
 * @author Sean A. Irvine
 */
public class A015050 extends A013929 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z s = t.root(3);
    while (true) {
      if (Z.ZERO.equals(s.pow(3).mod(t))) {
        return s;
      }
      s = s.add(1);
    }
  }
}
