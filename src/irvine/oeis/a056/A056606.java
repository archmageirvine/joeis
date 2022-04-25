package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001142;

/**
 * A056606 Squarefree kernel of lcm(binomial(n,0), ..., binomial(n,n)).
 * @author Sean A. Irvine
 */
public class A056606 extends A001142 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).squareFreeKernel();
  }
}

