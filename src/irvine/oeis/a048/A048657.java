package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A048657 Number of non-unitary divisors of n!.
 * @author Sean A. Irvine
 */
public class A048657 extends A000142 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    return fs.sigma0().subtract(fs.unitarySigma0());
  }
}
