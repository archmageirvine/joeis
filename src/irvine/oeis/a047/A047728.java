package irvine.oeis.a047;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047728 Intersection of A046985 and A007691: multiply perfect, refactorable numbers with integer average divisor dividing the number.
 * @author Sean A. Irvine
 */
public class A047728 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z s0 = fs.sigma0();
      final Z s1 = fs.sigma();
      if (s1.mod(s0).isZero() && mN.mod(s0).isZero() && s1.mod(mN).isZero() && s0.modMultiply(mN, s1).isZero()) {
        return mN;
      }
    }
  }
}
