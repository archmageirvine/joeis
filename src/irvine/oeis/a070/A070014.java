package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069970.
 * @author Sean A. Irvine
 */
public class A070014 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final int omega = fs.omega();
    return Z.valueOf((fs.bigOmega() + omega - 1) / omega);
  }
}
