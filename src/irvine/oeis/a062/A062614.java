package irvine.oeis.a062;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A062614 Squarefree parts of products of numbers of faces of Platonic solids.
 * @author Sean A. Irvine
 */
public class A062614 extends A062554 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).core();
  }
}
