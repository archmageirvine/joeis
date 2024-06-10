package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070306 a(n) = 2*phi(n)/2^omega(n).
 * @author Sean A. Irvine
 */
public class A070306 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.phi().shiftRight(fs.omega() - 1);
  }
}
