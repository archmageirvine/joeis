package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A395681 allocated for Tymofii Kasian.
 * @author Sean A. Irvine
 */
public class A395681 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.valueOf(mN - 1);
    }
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    for (final Z pp : Jaguar.factor(mN).toZArray()) {
      final long p = pp.longValue();
      for (long q = p; q <= mN; q += p) {
        seen.set(q);
      }
    }
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (!seen.isSet(k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
