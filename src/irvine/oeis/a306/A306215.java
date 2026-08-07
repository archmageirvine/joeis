package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A306215 a(n) gives the length of A306211 after n generations.
 * @author Sean A. Irvine
 */
public class A306215 extends Sequence0 {

  private final LongDynamicByteArray mS = new LongDynamicByteArray();
  private long mLength = 0;

  @Override
  public Z next() {
    if (mLength == 0) {
      mLength = 1;
      mS.set(0, (byte) 1);
      return Z.ONE;
    }
    final long oldLength = mLength;
    long i = 0;
    while (i < oldLength) {
      final byte v = mS.get(i);
      byte cnt = 1;
      ++i;
      while (i < oldLength && mS.get(i) == v) {
        ++cnt;
        ++i;
      }
      mS.set(mLength++, cnt);
    }
    return Z.valueOf(mLength);
  }
}
