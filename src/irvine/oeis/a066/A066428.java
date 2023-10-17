package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066428 Numbers with mu = 0 and infinitary MoebiusMu = +1 (sum of binary digits of prime exponents is even).
 * @author Sean A. Irvine
 */
public class A066428 extends Sequence1 {

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
        if ((w & 1) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
