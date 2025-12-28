package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A082846 a(1) = 1, a(2) = 2, a(3) = 3; then a(a(1)+a(2)+..+a(k)) = a(k) and fill the "holes" using the rule : a(m) = 1 if a(m-1) = 3, a(m) = 2 if a(m-1) = 1, a(m) = 3 if a(m-1) = 2.
 * @author Sean A. Irvine
 */
public class A082846 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = 0;
  private long mSum = 0;
  {
    mA.set(1, (byte) 1);
    mA.set(2, (byte) 2);
    mA.set(3, (byte) 3);
  }

  @Override
  public Z next() {
    if (mA.get(++mN) == 0) {
      mA.set(mN, (byte) (1 + mA.get(mN - 1) % 3));
    }
    final byte res = mA.get(mN);
    mSum += res;
    if (mA.get(mSum) == 0) {
      mA.set(mSum, res);
    }
    return Z.valueOf(res);
  }
}
