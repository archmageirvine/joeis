package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a003.A003627;

/**
 * A393610 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393610 extends A003627 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.NEG_ONE;
    }
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply(3);
      if (p.add(t).subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
