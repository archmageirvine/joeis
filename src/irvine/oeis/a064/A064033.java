package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064033 Product of non-unitary divisors of binomial(n, floor(n/2)) or a(n) = 1 if all divisors are unitary. See A046098.
 * @author Sean A. Irvine
 */
public class A064033 extends A001405 {

  /** Construct the sequence. */
  public A064033() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final FactorSequence fs = Jaguar.factor(f);
    return f.pow(fs.sigma0().subtract(fs.unitarySigma0()).divide2());
  }
}
