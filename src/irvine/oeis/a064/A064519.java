package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064519 Numbers n such that usigma(n) / tau(n) is prime.
 * @author Sean A. Irvine
 */
public class A064519 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z u = fs.unitarySigma();
      final Z s = fs.sigma0();
      if (u.mod(s).isZero() && u.divide(s).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

