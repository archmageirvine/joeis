package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A064569 Quotients A005132(k)/k for k=A064568(n).
 * @author Sean A. Irvine
 */
public class A064569 extends Sequence1 {

  private final Sequence mA = new A005132().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (t.mod(++mN) == 0) {
        return t.divide(mN);
      }
    }
  }
}

