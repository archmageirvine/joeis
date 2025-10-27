package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A048633 Largest squarefree number dividing n-th central binomial coefficient C(n,[ n/2 ]).
 * @author Sean A. Irvine
 */
public class A048633 extends A001405 {

  /** Construct the sequence. */
  public A048633() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factor(super.next()).squareFreeKernel();
  }
}
