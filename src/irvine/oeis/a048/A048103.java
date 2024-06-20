package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048103 Numbers not divisible by p^p for any prime p.
 * @author Sean A. Irvine
 */
public class A048103 extends Sequence1 {

  private long mN = 0;

  /**
   * Check that <code>p^p</code> does not divide a factor sequence for any prime <code>p</code>.
   * @param fs factor sequence
   * @return true iff <code>p^p</code> does not divide for any prime
   */
  public static boolean isOk(final FactorSequence fs) {
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) >= p.intValueExact()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isOk(Jaguar.factor(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }

}
