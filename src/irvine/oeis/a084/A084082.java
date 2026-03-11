package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A084082 Length of lists created by n substitutions k -&gt; Range[ -Floor[Abs[k]/2],Floor[Abs[k]+3/2]] starting with {0}.
 * @author Sean A. Irvine
 */
public class A084082 extends Sequence0 {

  private LongDynamicByteArray mCurrent = new LongDynamicByteArray();

  @Override
  public Z next() {
    if (mCurrent.length() == 0) {
      mCurrent.set(0L, (byte) 0);
      return Z.ONE;
    }
    final LongDynamicByteArray next = new LongDynamicByteArray();
    for (long k = 0, j = 0; k < mCurrent.length(); ++k) {
      final int v = mCurrent.get(k);
      for (int i = -Math.abs(v) / 2; i <= Math.abs(v) + 1; ++i) {
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

