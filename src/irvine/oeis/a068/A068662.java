package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031312;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A068662 extends Sequence1 {

  private final Sequence mA = new A031312();

  @Override
  public Z next() {
    Z t = Z.ZERO;
    while (true) {
      t = t.multiply(10).add(mA.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
