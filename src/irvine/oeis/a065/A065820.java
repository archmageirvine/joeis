package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065820 Numbers n such that sigma_6(n)/sigma_2(n) is prime.
 * @author Sean A. Irvine
 */
public class A065820 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s5 = fs.sigma(6);
      final Z s1 = fs.sigma2();
      final Z[] qr = s5.divideAndRemainder(s1);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

