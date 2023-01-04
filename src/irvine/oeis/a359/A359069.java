package irvine.oeis.a359;

import irvine.factor.factor.TillmanFactorizer;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A359069 allocated for Kevin P. Thompson.
 * @author Sean A. Irvine
 */
public class A359069 extends Sequence1 {

  private static final TillmanFactorizer TILLMAN = new TillmanFactorizer();
  private static final long REPORT = 1000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private int mN = -1;

  private boolean precheck(final Z n) {
    // Make sure we cannot trivially reject this number
    return n.mod(4) != 0 && n.mod(9) != 0 && n.mod(25) != 0 && n.mod(49) != 0 && n.mod(121) != 0;
  }

  @Override
  public Z next() {
    mN += 2;
    Z p = Z.ONE;
    Z reportAt = Z.valueOf(REPORT);
    while (true) {
      p = mPrime.nextPrime(p);
      final Z t = p.pow(mN).subtract(1);
      if (precheck(t)) {
        final FactorSequence fs = TILLMAN.factorize(t);
        if (fs.omega() == mN && fs.isSquareFree()) {
          return p;
        }
      }
      if (mVerbose && p.compareTo(reportAt) > 0) {
        StringUtils.message("exponent " + mN + " no solution up to p=" + p);
        reportAt = reportAt.add(REPORT);
      }
    }
  }

  /**
   * Attempt to compute a specific term of the sequence.
   * @param args term number
   */
  public static void main(final String... args) {
    final A359069 seq = new A359069();
    seq.mN = Integer.parseInt(args[0]) * 2 - 3;
    System.out.println(seq.next());
  }
}
