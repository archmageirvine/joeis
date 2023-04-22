package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048881;

/**
 * A063252 Numbers for which a mixed L/R binary rotation sequence will reach a fixed point sooner than either a pure only-left or only-right iteration.
 * @author Sean A. Irvine
 */
public class A063252 extends Sequence1 {

  private final Sequence mLeft = new A048881();
  private final Sequence mRight = new A063250();
  private final Sequence mFree = new A063251();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z l = mLeft.next();
      final Z r = mRight.next();
      final Z f = mFree.next();
      if (f.compareTo(l) < 0 && f.compareTo(r) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
