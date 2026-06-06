package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A007001 Trajectory of 1 under the morphism 1 -&gt; 12, 2 -&gt; 123, 3 -&gt; 1234, etc.
 * @author Sean A. Irvine
 */
public class A007001 extends Sequence1 {

  private long mN = -1;
  private long mM = 1;
  protected final LongDynamicByteArray mSeq = new LongDynamicByteArray();
  {
    mSeq.set(0, (byte) 1);
    mSeq.set(1, (byte) 2);
  }

  @Override
  public Z next() {
    if (++mN >= mSeq.length()) {
      final int t = mSeq.get(mM++);
      if (t >= 126) {
        throw new UnsupportedOperationException();
      }
      for (int k = 1; k <= t + 1; ++k) {
        mSeq.set(mSeq.length(), (byte) k);
      }
    }
    return Z.valueOf(mSeq.get(mN));
  }

}

