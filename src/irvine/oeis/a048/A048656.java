package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A048656 a(n) is the number of unitary (and also of squarefree) divisors of n!.
 * @author Sean A. Irvine
 */
public class A048656 extends A000142 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    setOffset(1);
    super.next(); // skip 0!
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).unitarySigma0();
  }
}
