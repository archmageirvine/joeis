package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A085006 Let S(0)={1,1,2} S(n)={S(n-1), S(n-1)-{x},{3-x}} where x is the last element of S(n-1), then sequence is S(infinity).
 * @author Sean A. Irvine
 */
public class A085006 extends Sequence1 {

  private long mN = -1;
  private long mM = 3;
  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 1);
    mA.set(2, (byte) 2);
  }

  @Override
  public Z next() {
    if (++mN >= mM) {
      final long end = mM - 1;
      final byte x = mA.get(end);
      for (long k = 0; k < end; ++k) {
        mA.set(mM++, mA.get(k));
      }
      mA.set(mM++, (byte) (3 - x));
    }
    return Z.valueOf(mA.get(mN));
  }
}
