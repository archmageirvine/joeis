package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A051521 Number of ways to represent n as k/d(k), where d(k) is the number of divisors of k, A000005.
 * @author Sean A. Irvine
 */
public class A051521 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 4 * mN * mN) {
      final long d = Cheetah.factor(mM).sigma0().longValueExact();
      if (mM % d == 0) {
        final long v = mM / d;
        mA.set(v, mA.get(v) + 1);
      }
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
