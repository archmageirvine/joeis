package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A145523 Least integer k <code>&gt; 0</code> such that <code>A000041(k)</code> is divisible by <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A145523 implements Sequence {

  private final Sequence mA41 = new A000041();
  {
    mA41.next(); // skip zeroth entry
  }
  private int mN = -1;
  private long mIndex = 0;
  private int mRecent = -1;

  private int step() {
    ++mIndex;
    return mA41.next().getLowestSetBit();
  }

  @Override
  public Z next() {
    ++mN;
    while (mRecent < mN) {
      mRecent = step();
    }
    return Z.valueOf(mIndex);
  }

}

