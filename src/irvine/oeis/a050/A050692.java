package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050692 Largest prime factor of composite a(n) is a substring of a(n).
 * @author Sean A. Irvine
 */
public class A050692 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z[] d = fs.toZArray();
        if (String.valueOf(mN).contains(d[d.length - 1].toString())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
