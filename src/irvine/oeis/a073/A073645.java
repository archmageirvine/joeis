package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A073645 a(1)=2 and, for all n&gt;=1, a(n) is the length of the n-th run of increasing consecutive integers with each run after the first starting with 1.
 * @author Sean A. Irvine
 */
public class A073645 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 2);
    mA.set(1, (byte) 3);
  }
  private long mM = 0;
  private long mR = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (mA.get(++mN) == 0) {
      ++mM;
      for (byte k = 1; k <= mA.get(mM); ++k) {
        mA.set(++mR, k);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
