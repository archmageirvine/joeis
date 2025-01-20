package irvine.oeis.a074;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A074270 a(n) = the least positive number X such that Cn(X) is X-smooth, where Cn is the n-th cyclotomic polynomial and "X-smooth" means "has no prime factor greater than X".
 * @author Sean A. Irvine
 */
public class A074270 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final PrimeDivision f = new PrimeDivision(m);
      final FactorSequence fs = new FactorSequence(Functions.CYCLOTOMIC.z(mN, ++m));
      f.factor(fs);
      if (fs.isComplete() && fs.largestPrimeFactor().compareTo(m) <= 0) {
        return Z.valueOf(m);
      }
      if (mVerbose && m % 10000 == 0) {
        StringUtils.message(mN + " search complete to " + m);
      }
    }
  }
}
