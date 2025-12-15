package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082572 a(n) is the least number m such that the arithmetic mean of the distinct primes dividing m equals n.
 * @author Sean A. Irvine
 */
public class A082572 extends Sequence2 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 1;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      final long s1 = Functions.SOPF.l(mM);
      final long s0 = Functions.OMEGA.i(mM);
      if (s1 % s0 == 0) {
        final long t = s1 / s0;
        if (mFirsts.get(t) == 0) {
          mFirsts.set(t, mM);
        }
      }
      ++mM;
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
