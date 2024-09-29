package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056648 a(n) = A034444(A056647(n)).
 * @author Sean A. Irvine
 */
public class A056648 extends A056057 {

  private final Sequence mA = new A056059();
  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mFactor.factorize(super.next().sqrt().divide(mA.next())).omega());
  }
}
