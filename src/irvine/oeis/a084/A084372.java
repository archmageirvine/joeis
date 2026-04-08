package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084372 Least composite k such that the nearest integer to the average of the smallest and largest prime factors of k equals n.
 * @author Sean A. Irvine
 */
public class A084372 extends Sequence2 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (!Predicates.PRIME.is(++mM)) {
        final long gpf = Functions.GPF.l(mM);
        final long lpf = Functions.LPF.l(mM);
        final long avg = (gpf + lpf + 1) / 2;
        if (mFirsts.get(avg) == 0) {
          mFirsts.set(avg, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
