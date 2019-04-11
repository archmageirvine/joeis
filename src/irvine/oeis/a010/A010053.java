package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010053 <code>4^n*(2*n+1)!*(n!)^2/(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A010053 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN).multiply(mN).multiply(2 * mN + 1).multiply(2 * mN).shiftLeft(2);
    }
    return mF.divide(mN + 1);
  }
}

