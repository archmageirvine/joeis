package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;

/**
 * A001468 There are <code>a(n)</code> 2's between successive 1's.
 * @author Sean A. Irvine
 */
public class A001468 implements Sequence {

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
      mSeq.set(mSeq.length(), (byte) 2);
      if (v == 2) {
        mSeq.set(mSeq.length(), (byte) 2);
      }
    }
    return Z.valueOf(v);
  }
}

