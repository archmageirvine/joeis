package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006347 a(n) = (n+1) a(n-1) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A006347 extends Sequence1 {

  private long mN = 1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(mN).signedAdd((mN & 1) == 1, Z.ONE);
    }
    return mA;
  }
}

