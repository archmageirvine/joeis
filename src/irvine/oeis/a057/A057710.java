package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A057708.
 * @author Sean A. Irvine
 */
public class A057710 implements Sequence {

  private final LongDynamicByteArray mCount = new LongDynamicByteArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM < mN * mN) {
        final long s = Jaguar.factor(mM).sigma().longValueExact() - mM;
        final byte c = mCount.get(s);
        if (c <= 2) {
          mCount.set(s, (byte) (c + 1));
        }
        ++mM;
      }
      if (mCount.get(mN) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
