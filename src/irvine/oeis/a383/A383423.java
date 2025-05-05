package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003849;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A383423 extends Sequence1 {

  private final Sequence mA = new A003849();
  private final Sequence mB = new A383422();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().isZero() && mB.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

