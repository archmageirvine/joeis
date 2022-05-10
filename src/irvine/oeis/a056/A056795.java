package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A056795 Number of divisors of k as k runs through sequence of distinct values of LCM(1,..,n).
 * @author Sean A. Irvine
 */
public class A056795 extends A051451 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
