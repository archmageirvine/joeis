package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a048.A048855;

/**
 * A055679 Number of distinct prime factors of phi(n!).
 * @author Sean A. Irvine
 */
public class A055679 extends A048855 {

  /** Construct the sequence. */
  public A055679() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).omega());
  }
}
