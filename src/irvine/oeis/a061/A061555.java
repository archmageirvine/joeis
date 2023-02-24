package irvine.oeis.a061;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A061552.
 * @author Sean A. Irvine
 */
public class A061555 extends A000142 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    final Z f = super.next();
    return mFactor.factorize(f).sigma().divide(f);
  }
}
