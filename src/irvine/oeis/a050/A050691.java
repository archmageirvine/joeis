package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050691 Composite numbers whose decimal expansion starts with their largest prime divisor.
 * @author Sean A. Irvine
 */
public class A050691 implements Sequence {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z[] d = fs.toZArray();
        if (String.valueOf(mN).startsWith(d[d.length - 1].toString())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
