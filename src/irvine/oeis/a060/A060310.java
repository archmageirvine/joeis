package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A060310 a(1)=1, a(2)=3; then append digits of a(n-1)*a(n).
 * @author Sean A. Irvine
 */
public class A060310 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 3);
  }
  private long mN = -1;
  private long mNextFree = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN >= mNextFree) {
      final int v = mA.get(mM) * mA.get(++mM);
      if (v >= 10) {
        mA.set(mNextFree++, (byte) (v / 10));
        mA.set(mNextFree++, (byte) (v % 10));
      } else {
        mA.set(mNextFree++, (byte) v);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
