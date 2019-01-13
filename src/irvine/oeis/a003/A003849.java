package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;

/**
 * A003849.
 * @author Sean A. Irvine
 */
public class A003849 implements Sequence {

  private final DynamicByteArray mSeq = new DynamicByteArray();
  {
    mSeq.set(0, (byte) 0);
    mSeq.set(1, (byte) 1);
  }
  private int mLastWritten = -1;

  @Override
  public Z next() {
    final long v = mSeq.get(++mLastWritten);
    if (mLastWritten > 0) {
      mSeq.set(mSeq.length(), (byte) 0);
      if (v == 0) {
        mSeq.set(mSeq.length(), (byte) 1);
      }
    }
    return Z.valueOf(v);
  }
}

