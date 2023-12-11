package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000566;

/**
 * A067271 Numbers n such that the digits of P_7(n), the n-th heptagonal number, end in n.
 * @author Sean A. Irvine
 */
public class A067271 extends Sequence1 {

  private final Sequence mHeptagonal = new A000566().skip();
  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (mHeptagonal.next().mod(mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
