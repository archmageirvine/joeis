package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025476 Prime root of n-th nontrivial prime power (A025475).
 * @author Sean A. Irvine
 */
public class A025476 extends A025475 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).leastPrimeFactor();
  }
}

