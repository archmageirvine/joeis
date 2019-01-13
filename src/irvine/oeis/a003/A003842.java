package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;

/**
 * A003842.
 * @author Sean A. Irvine
 */
public class A003842 implements Sequence {

  private final DynamicByteArray mSeq = new DynamicByteArray();
  {
    mSeq.set(0, (byte) 1);
    mSeq.set(1, (byte) 2);
  }
  private int mLastWritten = -1;

  @Override
  public Z next() {
    final long v = mSeq.get(++mLastWritten);
    if (mLastWritten > 0) {
      mSeq.set(mSeq.length(), (byte) 1);
      if (v == 1) {
        mSeq.set(mSeq.length(), (byte) 2);
      }
    }
    return Z.valueOf(v);
  }
}

