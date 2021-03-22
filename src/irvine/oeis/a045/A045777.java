package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A045777 a(1)=1, a(2)=2; thereafter successive products of pairs of digits make further digits.
 * @author Sean A. Irvine
 */
public class A045777 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 2);
  }
  private long mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    if (mA.get(++mN) == 0) {
      final int t = mA.get(mM) * mA.get(mM - 1);
      if (t < 10) {
        mA.set(mN, (byte) t);
      } else {
        mA.set(mN, (byte) (t / 10));
        mA.set(mN + 1, (byte) (t % 10));
      }
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
