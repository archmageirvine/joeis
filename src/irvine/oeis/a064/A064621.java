package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A064621 Values of A005132(n) at which the ratio A005132(n)/n sets a new record.
 * @author Sean A. Irvine
 */
public class A064621 extends Sequence1 {

  private final Sequence mA = new A005132().skip();
  private long mN = 0;
  private Z mPrev = Z.ZERO;
  private long mPrevN = 1;

  protected Z select(final Z t, final long n) {
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA.next();
      if (t.multiply(mPrevN).compareTo(mPrev.multiply(mN)) > 0) {
        mPrev = t;
        mPrevN = mN;
        return select(t, mN);
      }
    }
  }
}
