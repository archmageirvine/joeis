package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003849;

/**
 * A383424 Indices k such that A003849(k) = 1 and A383422(k) = 1.
 * @author Sean A. Irvine
 */
public class A383424 extends Sequence1 {

  private final Sequence mA = new A003849();
  private final Sequence mB = new A383422();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z r = mA.next();
      final Z s = mB.next();
      if (r.isOne() && s.isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}

