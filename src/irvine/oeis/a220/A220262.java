package irvine.oeis.a220;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A220262 Number of even semiprimes &lt; 10^n. Number of terms of A100484 &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A220262 extends Sequence0 {

  private Z mLim = null;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    return Functions.PRIME_PI.z(mLim.divide2());
  }
}
