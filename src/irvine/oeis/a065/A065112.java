package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065112.
 * @author Sean A. Irvine
 */
public class A065112 extends A000040 {

  private Z mAdd = Z.TEN;

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
      return Z.ZERO;
    }
    if (p.compareTo(mAdd) >= 0) {
      mAdd = mAdd.multiply(10);
    }
    Z k = Z.ZERO;
    while (true) {
      k = k.add(mAdd);
      final Z t = k.add(p);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
