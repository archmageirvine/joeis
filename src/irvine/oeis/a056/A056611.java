package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001405;
import irvine.oeis.a002.A002944;

/**
 * A056611 Quotient: squarefree kernel of A002944(n) divided by that of A001405.
 * @author Sean A. Irvine
 */
public class A056611 extends A002944 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Sequence mA = new A001405();
  {
    next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).squareFreeKernel()
      .divide(mFactor.factorize(mA.next()).squareFreeKernel());
  }
}

