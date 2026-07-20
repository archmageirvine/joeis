package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001913;

/**
 * A086018 Number of cyclic numbers (A001913) &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A086018 extends Sequence0 {

  private final Sequence mS = new A001913();
  private long mA = mS.next().longValueExact();
  private long mLim = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim == 0 ? 1 : mLim * 10;
    while (mA < mLim) {
      ++mCount;
      mA = mS.next().longValueExact();
    }
    return Z.valueOf(mCount);
  }
}

