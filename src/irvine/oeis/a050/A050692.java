package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050692 Largest prime factor of composite a(n) is a substring of a(n).
 * @author Sean A. Irvine
 */
public class A050692 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z[] d = fs.toZArray();
        if (String.valueOf(mN).contains(d[d.length - 1].toString())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
