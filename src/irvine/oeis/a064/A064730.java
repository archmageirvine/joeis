package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064730 Numbers whose sum of nonunitary divisors and sum of unitary divisors are both positive squares.
 * @author Sean A. Irvine
 */
public class A064730 extends Sequence1 {

  private long mN = 15011;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence a = Jaguar.factor(++mN);
      final Z u = a.unitarySigma();
      final Z v;
      if (u.isSquare() && (v = a.sigma().subtract(u)).signum() > 0 && v.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

