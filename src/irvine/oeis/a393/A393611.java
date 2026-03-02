package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A393611 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393611 extends A002476 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply(3);
      if (p.add(t).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
