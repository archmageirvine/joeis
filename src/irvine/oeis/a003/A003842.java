package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;

/**
 * A003842 The infinite Fibonacci word: start with 1, repeatedly apply the morphism 1-&gt;12, 2-&gt;1, take limit; or, start with S(0)=2, S(1)=1, and for n&gt;1 define S(n)=S(n-1)S(n-2), then the sequence is S(oo).
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

