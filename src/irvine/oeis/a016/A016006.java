package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016006 a(n) = (tau(n^10)+9)/10.
 * @author Sean A. Irvine
 */
public class A016006 extends Sequence1 {

  protected long mN = 0;

  protected int power() {
    return 10;
  }

  @Override
  public Z next() {
    final FactorSequence fs = new FactorSequence();
    fs.add(++mN, FactorSequence.UNKNOWN, power());
    Jaguar.factor(fs);
    return fs.sigma0().add(power() - 1).divide(power());
  }
}
