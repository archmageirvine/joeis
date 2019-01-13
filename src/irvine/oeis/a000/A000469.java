package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000469.
 * @author Sean A. Irvine
 */
public class A000469 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z[] z = fs.toZArray();
      if (z.length == 1) {
        if (Z.ONE.equals(mN)) {
          return Z.ONE;
        }
      } else {
        boolean ok = true;
        for (final Z v : z) {
          if (fs.getExponent(v) >= 2) {
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
}
