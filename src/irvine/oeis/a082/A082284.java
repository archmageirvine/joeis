package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082284 a(n) = smallest number k such that k - tau(k) = n, or 0 if no such number exists, where tau(n) = the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A082284 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 2 * (mN + 1)) {
      final long v = ++mM - Functions.SIGMA0.l(mM);
      if (v >= 0 && mFirsts.get(v) == 0) {
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
