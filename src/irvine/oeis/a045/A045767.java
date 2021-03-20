package irvine.oeis.a045;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a007.A007661;

/**
 * A045767 Number of prime factors of triple factorials n!!! (A007661), with multiplicity.
 * @author Sean A. Irvine
 */
public class A045767 extends A007661 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
