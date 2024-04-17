package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045835 Numbers n such that sopfr(Omega(n)) = Omega(sopfr(n)), where Omega(m) is the number and sopfr(m) is the sum of prime factors of m, with repetition respectively.
 * @author Sean A. Irvine
 */
public class A045835 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.SOPFR.z(fs.bigOmega()).equals(Functions.BIG_OMEGA.z(fs.sopfr()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

