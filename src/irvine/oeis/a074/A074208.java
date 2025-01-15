package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A074208 Least k &gt; 1 such that n divides sigma(k) - k.
 * @author Sean A. Irvine
 */
public class A074208 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Z t = Functions.SIGMA1.z(++mM).subtract(mM);
      if (t.signum() > 0) {
        for (final Z dd : Jaguar.factor(t).divisors()) {
          final long d = dd.longValueExact();
          if (mFirsts.get(d) == 0) {
            mFirsts.set(d, mM);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
