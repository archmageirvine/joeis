package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045835 Numbers n such that sopfr(Omega(n)) = Omega(sopfr(n)), where Omega(m) is the number and sopfr(m) is the sum of prime factors of m, with repetition respectively.
 * @author Sean A. Irvine
 */
public class A045835 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.bigOmega()).sopfr().equals(Z.valueOf(Jaguar.factor(fs.sopfr()).bigOmega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

