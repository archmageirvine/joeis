package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A073224 Partial sum of Pi(k) from 1 to 10^n.
 * @author Sean A. Irvine
 */
public class A073224 extends Sequence1 {

  private final Sequence mA = new A000720();
  private Z mSum = Z.ZERO;
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    mN *= 10L;
    while (mM < mN) {
      ++mM;
      mSum = mSum.add(mA.next());
    }
    return mSum;
  }
}
