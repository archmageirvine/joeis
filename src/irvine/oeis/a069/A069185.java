package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069185 Numbers n such that n=phi(n)*core(n) where phi(x) is the Euler totient function and core(x) the squarefree part of x (the smallest integer such that x*core(x) is a square).
 * @author Sean A. Irvine
 */
public class A069185 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.core().multiply(fs.phi()).equals(mN)) {
        return mN;
      }
    }
  }
}

