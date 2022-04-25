package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A056603 Squarefree kernels of distinct values of lcm(1,...,m) (A051451).
 * @author Sean A. Irvine
 */
public class A056603 extends A051451 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).squareFreeKernel();
  }
}

