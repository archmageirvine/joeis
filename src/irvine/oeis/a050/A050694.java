package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050694 Composite numbers k such that all prime factors of k are a substring of k.
 * @author Sean A. Irvine
 */
public class A050694 extends Sequence1 {

  private long mN = 24;

  @Override
  public Z next() {
    outer:
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final String s = String.valueOf(mN);
        for (final Z d : fs.toZArray()) {
          if (!s.contains(d.toString())) {
            continue outer;
          }
        }
        return Z.valueOf(mN);
      }
    }
  }
}
