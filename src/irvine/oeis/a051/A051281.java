package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051278.
 * @author Sean A. Irvine
 */
public class A051281 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z s0 = fs.sigma0();
      Z s = fs.sigma();
      while (true) {
        if (s.equals(Z.ONE)) {
          return Z.valueOf(mN);
        }
        final Z[] qr = s.divideAndRemainder(s0);
        if (!qr[1].isZero()) {
          break;
        }
        s = qr[0];
      }
    }
  }
}
