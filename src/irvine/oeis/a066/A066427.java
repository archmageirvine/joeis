package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066427 Numbers with mu = 0 and infinitary MoebiusMu = -1; (sum of binary digits of prime exponents is odd).
 * @author Sean A. Irvine
 */
public class A066427 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.mobius() == 0) {
        long w = 0;
        for (final Z p : fs.toZArray()) {
          w += Long.bitCount(fs.getExponent(p));
        }
        if ((w & 1) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
