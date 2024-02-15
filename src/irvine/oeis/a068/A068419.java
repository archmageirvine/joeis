package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068419 Odd prime values of sigma(k) - phi(k) taking k in increasing order.
 * @author Sean A. Irvine
 */
public class A068419 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.sigma().subtract(fs.phi());
      if (t.isOdd() && t.isProbablePrime()) {
        return t;
      }
    }
  }
}

