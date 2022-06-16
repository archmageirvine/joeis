package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057562.
 * @author Sean A. Irvine
 */
public class A057564 implements Sequence {

  private long mN = 665;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.sigma()).phi().equals(fs.phi().multiply2())) {
        final FactorSequence fsp = Jaguar.factor(mN + 2);
        if (fsp.sigma().equals(Jaguar.factor(fsp.phi()).sigma().multiply2())) {
          final FactorSequence fsm = Jaguar.factor(mN - 2);
          if (fsm.sigma().equals(Jaguar.factor(fsm.phi()).sigma().multiply2())) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

