package irvine.oeis.a045;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A045766 Number of prime factors of double factorials n!! (A006882), with multiplicity.
 * @author Sean A. Irvine
 */
public class A045766 extends A006882 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
