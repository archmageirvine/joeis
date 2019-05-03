package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A007538 A self-generating sequence: there are <code>a(n) 3</code>'s between successive <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A007538 implements Sequence {

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
