package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A055993 Number of square divisors of n!.
 * @author Sean A. Irvine
 */
public class A055993 extends A055772 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}

