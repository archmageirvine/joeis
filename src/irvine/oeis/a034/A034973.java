package irvine.oeis.a034;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A034973 Number of distinct prime factors in central binomial coefficients C(n, floor(n/2)), the terms of A001405.
 * @author Sean A. Irvine
 */
public class A034973 extends A001405 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).omega());
  }
}
