package irvine.oeis.a045;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a007.A007662;

/**
 * A045747 Number of prime factors of n!!!! (A007662), with multiplicity.
 * @author Sean A. Irvine
 */
public class A045747 extends A007662 {

  /** Construct the sequence. */
  public A045747() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
