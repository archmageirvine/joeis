package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069555 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      if (!LongUtils.isPalindrome(++mM, 10)) {
        final long r = Functions.REVERSE.l(mM);
        for (final Z dd : Jaguar.factor(mM).divisors()) {
          final long d = dd.longValue();
          if (r % d == 0 && mFirsts.get(d) == 0) {
            mFirsts.set(d, mM);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
