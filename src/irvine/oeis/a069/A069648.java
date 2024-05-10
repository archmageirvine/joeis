package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A069647 a(1) = 1; for n &gt; 1, the smallest n-th power with the digit sum also a nontrivial n-th power, i.e., 10^n is not a member.
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
