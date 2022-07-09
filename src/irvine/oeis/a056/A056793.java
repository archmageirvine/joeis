package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A056793 Number of divisors of lcm(1..n).
 * @author Sean A. Irvine
 */
public class A056793 extends A003418 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
