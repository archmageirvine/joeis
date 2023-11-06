package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066760 Sum_{1&lt;=k&lt;=n, k is not a divisor of n and k is not coprime to n} k.
 * @author Sean A. Irvine
 */
public class A066760 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(mN + 1).subtract(fs.phi()).multiply(mN).divide2().add(1).subtract(fs.sigma());
  }
}

