package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A007538 A self-generating sequence: there are a(n) 3's between successive 2's.
 * @author Sean A. Irvine
 */
public class A007538 extends AbstractSequence {

  /** Construct the sequence. */
  public A007538() {
    super(1);
  }

  private LongDynamicByteArray mSeq = new LongDynamicByteArray();
  private int mN = -1;

  {
    mSeq.set(0, (byte) 2);
  }

  @Override
  public Z next() {
    final int res = mSeq.get(++mN);
    for (int k = 0; k < res; ++k) {
      mSeq.set(mSeq.length(), (byte) 3);
    }
    mSeq.set(mSeq.length(), (byte) 2);
    return Z.valueOf(res);
  }
}
