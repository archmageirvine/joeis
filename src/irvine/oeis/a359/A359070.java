package irvine.oeis.a359;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.TillmanFactorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A359070 allocated for Kevin P. Thompson.
 * @author Sean A. Irvine
 */
public class A359070 extends Sequence1 {

  private static final long REPORT = 1000;
  private final Factorizer mFactorizer = new TillmanFactorizer();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean precheck(final Z n) {
    // Make sure we cannot trivially reject this number
    return n.mod(4) != 0 && n.mod(9) != 0 && n.mod(25) != 0 && n.mod(49) != 0 && n.mod(121) != 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2;
    long reportAt = REPORT;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(1);
      if (precheck(t)) {
        final FactorSequence fs = mFactorizer.factorize(t);
        if (fs.omega() == mN && fs.isSquareFree()) {
          return Z.valueOf(k);
        }
      }
      if (mVerbose && k >= reportAt) {
        StringUtils.message("exponent " + mN + " no solution up to k=" + k);
        reportAt += REPORT;
      }
    }
  }

  /**
   * Attempt to compute a specific term of the sequence.
   * @param args term number
   */
  public static void main(final String... args) {
    final A359070 seq = new A359070();
    seq.mN = Long.parseLong(args[0]) - 1;
    System.out.println(seq.next());
  }
}
