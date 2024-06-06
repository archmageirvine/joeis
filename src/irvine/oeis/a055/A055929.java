package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a039.A039716;

/**
 * A055929 Euler totient function of the factorial of prime(n).
 * @author Sean A. Irvine
 */
public class A055929 extends A039716 {

  protected final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).phi();
  }
}
