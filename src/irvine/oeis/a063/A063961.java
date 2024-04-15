package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063961 Numbers k such that z(k) = j(k), where z(k) = sopf(k - d(k)), j(k) = d(sopf(k) + k), sopf(k) = A008472(k) and d(k) = A000005(k).
 * @author Sean A. Irvine
 */
public class A063961 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z z = Jaguar.factor(mN - fs.sigma0AsLong()).sopf();
      final Z j = Functions.SIGMA0.z(fs.sopf().add(mN));
      if (z.equals(j)) {
        return Z.valueOf(mN);
      }
    }
  }
}

