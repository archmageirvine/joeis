package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038514 Primes corresponding to A046411.
 * @author Sean A. Irvine
 */
public class A038514 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final StringBuilder sb = new StringBuilder();
        for (final Z p : fs.toZArray()) {
          for (int k = 0; k < fs.getExponent(p); ++k) {
            sb.append(p);
          }
        }
        final Z t = new Z(sb);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
  }
}
