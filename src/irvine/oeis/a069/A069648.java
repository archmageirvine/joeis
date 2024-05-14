package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A069648 a(1) = 1, otherwise smallest m &gt; 1 such that the sum of digits of m^n is k^n for some k &gt; 1.
 * @author Sean A. Irvine
 */
public class A069648 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    long trivial = 10;
    while (true) {
      if (++k == trivial) {
        trivial *= 10;
      } else {
        final Z kn = Z.valueOf(k).pow(mN);
        final Z ds = Functions.DIGIT_SUM.z(kn);
        if (ds.root(mN).auxiliary() == 1) {
          return Z.valueOf(k);
        }
      }
      if (mVerbose && k % 1000000 == 0) {
        StringUtils.message("Search completed to " + k + "^" + mN);
      }
    }
  }
}
