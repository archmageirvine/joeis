package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078514 Numbers k such that the smallest prime dividing k is the largest exponent in the factorization of k.
 * @author Sean A. Irvine
 */
public class A078514 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Functions.LPF.l(++mN) == Jaguar.factor(mN).maxExponent()) {
        return Z.valueOf(mN);
      }
    }
  }
}

