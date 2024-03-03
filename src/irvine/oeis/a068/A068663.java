package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033308;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A068663 extends Sequence1 {

  private final Sequence mA = new A033308();

  @Override
  public Z next() {
    Z t = Z.ZERO;
    while (true) {
      t = t.multiply(10).add(mA.next());
      if (!Z.ONE.equals(t) && !t.isProbablePrime()) {
        return t;
      }
    }
  }
}
