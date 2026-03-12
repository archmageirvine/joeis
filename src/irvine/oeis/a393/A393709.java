package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393709 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393709 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.NEG_ONE;
    }
    Z t = Z.ONE;
    long k = 0;
    while (true) {
      t = t.multiply(3);
      ++k;
      if (t.add(p).divide2().isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
