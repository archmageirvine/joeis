package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065817 Numbers n such that sigma_5(n)/sigma_1(n) is prime.
 * @author Sean A. Irvine
 */
public class A065817 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s5 = fs.sigma(5);
      final Z s1 = fs.sigma();
      final Z[] qr = s5.divideAndRemainder(s1);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

