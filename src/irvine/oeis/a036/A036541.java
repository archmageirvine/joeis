package irvine.oeis.a036;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a001.A001405;

/**
 * A036541 Deficit of central binomial coefficients in terms of number of prime factors: a(n) shows how many fewer prime factors the n-th central binomial coefficient has than n!.
 * @author Sean A. Irvine
 */
public class A036541 extends A000720 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Sequence mA = new A001405().skip(1);

  @Override
  public Z next() {
    return super.next().subtract(mFactor.factorize(mA.next()).omega());
  }
}
