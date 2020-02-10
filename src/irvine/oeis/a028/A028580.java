package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028580 <code>C_{n+1}*C_n*C_{n-1}^2*C_{n-2}^4*...*C_2^{2^(n-2)}</code>, where <code>C_k</code> are the Catalan numbers <code>(A000108)</code>.
 * @author Sean A. Irvine
 */
public class A028580 implements Sequence {

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

