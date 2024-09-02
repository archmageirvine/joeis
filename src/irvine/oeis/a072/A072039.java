package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035312;
import irvine.util.array.LongDynamicIntArray;

/**
 * A072039 Row of Zorach additive triangle in which n appears (or 0 in the unlikely event that it does not).
 * @author Sean A. Irvine
 */
public class A072039 extends Sequence1 {

  private final Sequence mZorach = new A035312();
  private final LongDynamicIntArray mCols = new LongDynamicIntArray();
  private long mN = 0;
  private int mR = 0;
  private int mC = 0;

  @Override
  public Z next() {
    ++mN;
    while (mCols.get(mN) == 0) {
      if (++mC > mR) {
        ++mR;
        mC = 1;
      }
      mCols.set(mZorach.next().longValueExact(), mR);
    }
    return Z.valueOf(mCols.get(mN));
  }
}
