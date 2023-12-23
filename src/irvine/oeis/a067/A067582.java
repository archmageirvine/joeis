package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067582 Nonprime values of n such that bigomega(n)^omega(n)=omega(n)^bigomega(n) where bigomega(n) is the number of prime factors of n (counted with multiplicity) and omega(n) the number of distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A067582 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final long a = fs.omega();
      final long b = fs.bigOmega();
      if (b != 1 && LongUtils.pow(a, b) == LongUtils.pow(b, a)) {
        return Z.valueOf(mN);
      }
    }
  }
}
