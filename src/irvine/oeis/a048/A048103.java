package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048103 Numbers not divisible by p^p for any prime p.
 * @author Sean A. Irvine
 */
public class A048103 implements Sequence {

  private long mN = 0;

  private boolean isOk(final FactorSequence fs) {
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
