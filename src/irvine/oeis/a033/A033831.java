package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A033831 Number of numbers d dividing n such that d &gt;= 3 and 1 &lt;= n/d &lt;= d-2.
 * @author Sean A. Irvine
 */
public class A033831 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected long mN = 0;
  protected FactorSequence mFactorSequence; // for subclasses

  @Override
  public Z next() {
    long c = 0;
    mFactorSequence = Cheetah.factor(++mN);
    if (mVerbose && mN % 1000000 == 0) {
      StringUtils.message("n=" + mN);
    }
    for (final Z dd : mFactorSequence.divisors()) {
      final long d = dd.longValue();
      if (d >= 3 && mN / d <= d - 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
