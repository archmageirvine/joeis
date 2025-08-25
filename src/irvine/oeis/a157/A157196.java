package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A157196 a(n) = (1/2)*(sum of elements of n-th run) using 1 and 2 starting with 1,1.
 * @author Sean A. Irvine
 */
public class A157196 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(1, (byte) 1);
    mA.set(2, (byte) 1);
  }
  private long mH = 1;
  private long mM = 3;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= mM) {
      final long t = 2 - (++mH & 1);
      final long end = mM + mA.get(mH) * 2 / t;
      while (mM != end) {
        mA.set(mM++, (byte) t);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

