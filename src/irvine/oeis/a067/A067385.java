package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067385 a(n) is smallest x such that sigma(phi(x))/sigma(x) = n.
 * @author Sean A. Irvine
 */
public class A067385 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (Jaguar.factor(fs.phi()).sigma().equals(fs.sigma().multiply(mN))) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 1000000 == 0) {
        StringUtils.message("Search completed to " + k);
      }
    }
  }
}

