package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a052.A052486;

/**
 * A394768 Number of Achilles numbers that do not exceed 2^n.
 * @author Sean A. Irvine
 */
public class A394768 extends Sequence0 {

  private final Sequence mAchilles = new A052486();
  private Z mCount = Z.ZERO;
  private Z mLim = null;
  private Z mA = mAchilles.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    while (mA.compareTo(mLim) <= 0) {
      mCount = mCount.add(1);
      mA = mAchilles.next();
    }
    return mCount;
  }
}
