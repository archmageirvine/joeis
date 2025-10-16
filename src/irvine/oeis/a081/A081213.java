package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A081213 extends Sequence1 {

  private final DirectSequence mA = new A081210();
  private long mN = 0;

  @Override
  public Z next() {
    Z u = Z.valueOf(++mN);
    while (true) {
      final Z t = mA.a(u);
      if (t.equals(u)) {
        return t;
      }
      u = t;
    }
  }
}
