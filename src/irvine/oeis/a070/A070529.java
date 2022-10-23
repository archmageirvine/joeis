package irvine.oeis.a070;
// manually

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070529 Number of divisors of repunit 111...111 (with n digits).
 * @author Georg Fischer
 */
public class A070529 extends Sequence1 {

  protected Z mK = Z.ZERO;
  
  @Override
  public Z next() {
    mK = mK.multiply(Z.TEN).add(Z.ONE);
    return Z.ONE.equals(mK) ? Z.ONE : Jaguar.factor(mK).sigma0();
  }
}
