package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002035.
 * @author Sean A. Irvine
 */
public class A002035 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence f = Cheetah.factor(mN);
      boolean ok = true;
      for (final Z z : f.toZArray()) {
        if ((f.getExponent(z) & 1) == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mN;
      }
    }
  }
}

