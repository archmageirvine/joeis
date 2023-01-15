package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A061026 Smallest number m such that phi(m) is divisible by n, where phi = Euler totient function A000010.
 * @author Sean A. Irvine
 */
public class A061026 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      for (final Z dd : Jaguar.factor(Euler.phi(Z.valueOf(++mM))).divisors()) {
        final long d = dd.longValue();
        if (mFirsts.get(d) == 0) {
          mFirsts.set(d, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
