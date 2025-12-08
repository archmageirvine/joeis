package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A082391 Start with the sequence a(1 to 4) = "1,3,2,3". Then in step s, append "1", "1,2", or "1,2,3", whichever ends with a(s+2).
 * @author Sean A. Irvine
 */
public class A082391 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 3);
    mA.set(2, (byte) 2);
    mA.set(3, (byte) 3);
  }
  private long mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    if (mA.get(++mN) == 0) {
      ++mM;
      for (int k = 0; k < mA.get(mM); ++k) {
        mA.set(mN + k, (byte) (k + 1));
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
