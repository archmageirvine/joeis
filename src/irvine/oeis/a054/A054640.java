package irvine.oeis.a054;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A054640 a(n) is the sum of the divisors of the n-th primorial: a(n) = A000203(A002110(n)).
 * @author Sean A. Irvine
 */
public class A054640 extends A002110 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma();
  }
}
