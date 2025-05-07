package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003849;

/**
 * A383426 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383426 extends Sequence1 {

  private final Sequence mA = new A003849();
  private final Sequence mB = new A383422();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z r = mA.next();
      final Z s = mB.next();
      if (r.isOne() && s.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

