package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A083921 Start with (1,2) and then concatenate 2^n+1 previous terms, n&gt;=0 and add 2 if a(2^n+1)=1 or add 1 if a(2^n+1)=2.
 * @author Sean A. Irvine
 */
public class A083921 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 2);
  }
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM == mA.length()) {
      for (long j = 0, k = mM; j < mM; ++j, ++k) {
        mA.set(k, mA.get(j));
      }
      mA.set(mA.length(), (byte) (mA.get(mM - 1) == 1 ? 2 : 1));
    }
    return Z.valueOf(mA.get(mM));
  }
}
