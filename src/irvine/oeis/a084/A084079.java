package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A084079 Sum of absolute values of lists created by n substitutions k -&gt; Range[ -Abs[k+1],Abs[k-1],2] starting with {1}.
 * @author Sean A. Irvine
 */
public class A084079 extends Sequence0 {

  private LongDynamicByteArray mCurrent = new LongDynamicByteArray();

  @Override
  public Z next() {
    if (mCurrent.length() == 0) {
      mCurrent.set(0L, (byte) 1);
      return Z.ONE;
    }
    long sum = 0; // We will run out of memory before we exhaust a long
    final LongDynamicByteArray next = new LongDynamicByteArray();
    for (long k = 0, j = 0; k < mCurrent.length(); ++k) {
      final int v = mCurrent.get(k);
      for (int i = -Math.abs(v + 1); i <= Math.abs(v - 1); i += 2) {
        final int a = Math.abs(i);
        if (a > Byte.MAX_VALUE) {
          throw new ArithmeticException();
        }
        sum += a;
        next.set(j++, (byte) a);
      }
    }
    mCurrent = next;
    return Z.valueOf(sum);
  }
}

