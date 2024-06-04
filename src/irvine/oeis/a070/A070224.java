package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070224.
 * @author Sean A. Irvine
 */
public class A070224 extends Sequence1 {

  private long mN = 17;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sp2 = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sp2 = sp2.add(p.square());
      }
      if (fs.sigma2().mod(sp2).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

