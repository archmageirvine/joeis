package irvine.oeis.a034;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A034974 Number of divisors of binomial(n, floor(n/2)), the terms of A001405.
 * @author Sean A. Irvine
 */
public class A034974 extends A001405 {

  /** Construct the sequence. */
  public A034974() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
