package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006347 <code>a(n) = (n+1) a(n-1) + (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A006347 implements Sequence {

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

