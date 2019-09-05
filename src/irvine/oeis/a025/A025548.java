package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025548.
 * @author Sean A. Irvine
 */
public class A025548 extends A025547 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
