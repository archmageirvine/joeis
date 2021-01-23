package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A001030 Fixed under 1 -&gt; 21, 2 -&gt; 211.
 * @author Sean A. Irvine
 */
public class A001030 implements Sequence {

  private final LongDynamicByteArray mSeq = new LongDynamicByteArray();
  private long mPos = -1;

  @Override
  public Z next() {
    final long r = ++mPos == 0 ? 2 : mSeq.get(mPos);
    mSeq.set(mSeq.length(), (byte) 2);
    mSeq.set(mSeq.length(), (byte) 1);
    if (r == 2) {
      mSeq.set(mSeq.length(), (byte) 1);
    }
    return Z.valueOf(r);
  }
}
