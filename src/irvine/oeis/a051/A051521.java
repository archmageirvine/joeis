package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A051521 Number of ways to represent n as k/d(k), where d(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A051521 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 4 * mN * mN) {
      final long d = Functions.SIGMA0.l(mM);
      if (mM % d == 0) {
        mA.increment(mM / d);
      }
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
