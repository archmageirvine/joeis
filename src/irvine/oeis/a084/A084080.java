package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A084080 Length of lists created by n substitutions k -&gt; Range[k+1,1,-3] starting with {1}, counting down from k+1 to 1 step -3.
 * @author Sean A. Irvine
 */
public class A084080 extends Sequence0 {

  private LongDynamicByteArray mCurrent = new LongDynamicByteArray();

  @Override
  public Z next() {
    if (mCurrent.length() == 0) {
      mCurrent.set(0L, (byte) 1);
      return Z.ONE;
    }
    final LongDynamicByteArray next = new LongDynamicByteArray();
    for (long k = 0, j = 0; k < mCurrent.length(); ++k) {
      final int v = mCurrent.get(k);
      for (int i = v + 1; i >= 1; i -= 3) {
        if (i > Byte.MAX_VALUE) {
          throw new ArithmeticException();
        }
        next.set(j++, (byte) i);
      }
    }
    mCurrent = next;
    return Z.valueOf(mCurrent.length());
  }
}

