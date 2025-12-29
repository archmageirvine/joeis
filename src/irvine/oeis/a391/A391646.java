package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A391646 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A391646 extends Sequence0 {

  private long mN = -1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mM = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO; // Feels contrived, should be 1
    }
    while (mFirsts.get(mN) == 0) {
      if (Predicates.SQUAREFUL.is(++mM)) {
        long sum = 0;
        final FactorSequence fs = Jaguar.factor(mM);
        for (final Z p : fs.toZArray()) {
          sum += p.mod(fs.getExponent(p));
        }
        if (mFirsts.get(sum) == 0) {
          mFirsts.set(sum, mM);
          if (mVerbose) {
            StringUtils.message("Solution for n=" + sum + " is " + mM);
          }
        }
      }
      if (mVerbose && mM % 10000000 == 0) {
        StringUtils.message("Search completed to " + mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
