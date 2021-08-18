package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050694 Composite numbers n such that all prime factors of n are a substring of n.
 * @author Sean A. Irvine
 */
public class A050694 implements Sequence {

  private long mN = 24;

  @Override
  public Z next() {
    outer:
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
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
