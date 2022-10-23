package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007503 Number of subgroups of dihedral group: sigma(n) + d(n).
 * @author Sean A. Irvine
 */
public class A007503 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma().add(fs.sigma0());
  }
}
