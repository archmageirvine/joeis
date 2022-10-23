package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050696 At least one prime factor of composite a(n) is a substring of a(n).
 * @author Sean A. Irvine
 */
public class A050696 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final String s = String.valueOf(mN);
        for (final Z d : fs.toZArray()) {
          if (s.contains(d.toString())) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
