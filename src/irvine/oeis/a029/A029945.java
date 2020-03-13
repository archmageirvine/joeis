package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029945 Smallest square containing n-th prime as substring.
 * @author Sean A. Irvine
 */
public class A029945 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    Z t = Z.THREE;
    while (true) {
      t = t.add(1);
      final Z t2 = t.square();
      if (t2.toString().contains(s)) {
        return t2;
      }
    }
  }
}
