package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066112 Numbers n such that sigma_4(n)/sigma_2(n) is an integer but not a prime.
 * @author Sean A. Irvine
 */
public class A066112 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s4 = fs.sigma(4);
      final Z s2 = fs.sigma2();
      final Z[] qr = s4.divideAndRemainder(s2);
      if (qr[1].isZero() && !qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
