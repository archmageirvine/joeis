package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a055.A055661;

/**
 * A060589.
 * @author Sean A. Irvine
 */
public class A060573 extends A055661 {

  @Override
  public Z next() {
    Z t = super.next();
    long k = 1;
    while (t.mod(3) != 0) {
      t = t.divide(3);
      ++k;
    }
    return Z.valueOf(k);
  }
}
