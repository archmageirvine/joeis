package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066922 a(n) = gcd(Omega(n), omega(n)).
 * @author Sean A. Irvine
 */
public class A066922 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(LongUtils.gcd(fs.omega(), fs.bigOmega()));
  }
}

