package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A056839 Squarefree part of lcm(1,...,n).
 * @author Sean A. Irvine
 */
public class A056839 extends A003418 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).core();
  }
}
