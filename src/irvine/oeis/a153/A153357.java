package irvine.oeis.a153;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001008;

/**
 * A153357 Numbers n such that the Wolstenholme number <code>A001008(n)</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A153357 extends A001008 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      final Z candidate = super.next();
      if (mVerbose) {
        System.out.println("[" + mN + "]: " + candidate);
      }
      final FactorSequence fs = Jaguar.factorAllowIncomplete(candidate);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Cannot determine if " + candidate + " is semiprime");
      }
    }
  }
}
