package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008936 Expansion of <code>(1 - 2*x -x^4)/(1 - 2*x)^2</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A008936 implements Sequence {

  private int mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = ++mN < 4 ? Z.ONE.shiftLeft(mN) : mA.multiply2().subtract(Z.ONE.shiftLeft(mN - 4));
    return mA;
  }
}
