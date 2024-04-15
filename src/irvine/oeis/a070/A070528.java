package irvine.oeis.a070;
// manually

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070528 Number of divisors of 10^n-1 (999...999 with n digits).
 * @author Georg Fischer
 */
public class A070528 extends Sequence1 {

  protected Z mK = Z.NINE;
  
  @Override
  public Z next() {
    final Z result = Functions.SIGMA0.z(mK);
    mK = mK.multiply(Z.TEN).add(Z.NINE);
    return result;
  }
}
