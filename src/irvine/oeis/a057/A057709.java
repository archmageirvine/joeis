package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A057709 Numbers k such that there is a unique m for which the sum of the aliquot parts of m (A001065) is k.
 * @author Sean A. Irvine
 */
public class A057709 implements Sequence {

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
        if (c <= 1) {
          mCount.set(s, (byte) (c + 1));
        }
        ++mM;
      }
      if (mCount.get(mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
