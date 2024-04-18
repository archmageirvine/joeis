package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057564 Natural numbers n for which the following three properties hold: (i) Phi[Sigma[n]]=2*phi(n), (ii) Sigma[n-2]=2*Sigma[Phi[n-2]], (iii) Sigma[n+2]=2*Sigma[Phi[n+2]].
 * @author Sean A. Irvine
 */
public class A057564 extends Sequence1 {

  private long mN = 665;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.PHI.z(fs.sigma()).equals(fs.phi().multiply2())) {
        final FactorSequence fsp = Jaguar.factor(mN + 2);
        if (fsp.sigma().equals(Functions.SIGMA.z(fsp.phi()).multiply2())) {
          final FactorSequence fsm = Jaguar.factor(mN - 2);
          if (fsm.sigma().equals(Functions.SIGMA.z(fsm.phi()).multiply2())) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

