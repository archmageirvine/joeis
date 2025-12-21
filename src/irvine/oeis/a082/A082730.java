package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082730 a(n) = smallest number k such that k - ms(k) = n, or 0 if no such number has been found, where ms(k) = sum of divisors of k other than k.
 * @author Sean A. Irvine
 */
public class A082730 extends Sequence0 implements Conjectural {

  private static final long HEURISTIC = 50000; // big enough for a(259)
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 && mM <= HEURISTIC * (mN + 1)) {
      final long v = 2 * ++mM - Functions.SIGMA.l(mM);
      if (v >= 0 && mFirsts.get(v) == 0) {
        if (v < mN) {
          throw new RuntimeException("Previously reported 0 for " + v + " was incorrect, it should be " + mM);
        }
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
