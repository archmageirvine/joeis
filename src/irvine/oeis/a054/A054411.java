package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054411 Numbers k such that Sum_{j} p_j = Sum_{j} e_j where Product_{j} p_j^(e_j) is the prime factorization of k.
 * @author Sean A. Irvine
 */
public class A054411 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      long sumP = 0;
      long sumE = 0;
      for (final Z p : fs.toZArray()) {
        sumP += p.longValue();
        sumE += fs.getExponent(p);
      }
      if (sumP == sumE) {
        return Z.valueOf(mN);
      }
    }
  }
}
