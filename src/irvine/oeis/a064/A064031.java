package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064031 Product of non-unitary divisors of n!.
 * @author Sean A. Irvine
 */
public class A064031 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final FactorSequence fs = Jaguar.factor(f);
    return f.pow(fs.sigma0().subtract(fs.unitarySigma0()).divide2());
  }
}
