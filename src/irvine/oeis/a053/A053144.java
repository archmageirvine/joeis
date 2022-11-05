package irvine.oeis.a053;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053144 Cototient of the n-th primorial number.
 * @author Sean A. Irvine
 */
public class A053144 extends A002110 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(mFactor.factorize(p).phi());
  }
}
