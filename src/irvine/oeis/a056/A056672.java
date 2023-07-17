package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a055.A055773;

/**
 * A056672 Number of unitary and squarefree divisors of n! Also, number of divisors of the special squarefree part of n!, A055773(n).
 * @author Sean A. Irvine
 */
public class A056672 extends A055773 {

  /** Construct the sequence. */
  public A056672() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
