package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056100 Sigma(n)*Phi(n) + 1 (Mod n).
 * @author Sean A. Irvine
 */
public class A056100 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.sigma().multiply(fs.phi()).add(1).mod(mN);
  }
}
