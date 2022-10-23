package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028580 C_{n+1}*C_n*C_{n-1}^2*C_{n-2}^4*...*C_2^{2^(n-2)}, where C_k are the Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A028580 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.square().multiply(2 * mN - 1).multiply2().divide(mN + 1);
    }
    return mA;
  }
}

