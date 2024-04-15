package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A057709 Numbers k such that there is a unique m for which the sum of the aliquot parts of m (A001065) is k.
 * @author Sean A. Irvine
 */
public class A057709 extends Sequence1 {

  private final LongDynamicByteArray mCount = new LongDynamicByteArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM < mN * mN) {
        final long s = Functions.SIGMA.l(mM) - mM;
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
