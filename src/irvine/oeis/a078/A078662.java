package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a020.A020492;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078662 extends Sequence0 {

  private final Sequence mBalanced = new A020492();
  private Z mA = mBalanced.next();
  private long mCount = 0;
  private Z mLim = null;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    while (mA.compareTo(mLim) <= 0) {
      ++mCount;
      mA = mBalanced.next();
    }
    return Z.valueOf(mCount);
  }
}

