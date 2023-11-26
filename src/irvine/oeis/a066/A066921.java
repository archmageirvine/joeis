package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066921 a(n) = lcm(Omega(n), omega(n)).
 * @author Sean A. Irvine
 */
public class A066921 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(LongUtils.lcm(fs.omega(), fs.bigOmega()));
  }
}

