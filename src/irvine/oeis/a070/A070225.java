package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070225 Numbers k such that (sigma(k)-k) - Sum_{p|k} p^2 = -1.
 * @author Sean A. Irvine
 */
public class A070225 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = fs.sigma().subtract(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.subtract(p.square());
      }
      if (Z.NEG_ONE.equals(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}

