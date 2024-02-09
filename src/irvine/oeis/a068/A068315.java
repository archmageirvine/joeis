package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;
import irvine.oeis.a025.A025474;

/**
 * A068308.
 * @author Sean A. Irvine
 */
public class A068315 extends Sequence1 {

  private final Sequence mA = new A025474();
  private final Sequence mB = new A000961();
  private boolean mStatus = mA.next().compareTo(Z.ONE) > 0;

  @Override
  public Z next() {
    while (true) {
      final boolean prev = mStatus;
      mStatus = mA.next().compareTo(Z.ONE) > 0;
      final Z t = mB.next();
      if (prev && mStatus) {
        return t;
      }
    }
  }
}
