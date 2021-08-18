package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050696 At least one prime factor of composite a(n) is a substring of a(n).
 * @author Sean A. Irvine
 */
public class A050696 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
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
