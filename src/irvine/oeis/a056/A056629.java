package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055071;
import irvine.oeis.a055.A055230;

/**
 * A056629 a(n) = A034444(A056627(n)).
 * @author Sean A. Irvine
 */
public class A056629 extends A055071 {

  private final Sequence mA = new A055230();
  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mFactor.factorize(super.next().sqrt().divide(mA.next())).omega());
  }
}
