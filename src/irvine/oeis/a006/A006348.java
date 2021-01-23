package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006348 a(n) = (n+2)*a(n-1) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A006348 implements Sequence {

  private long mN = 2;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(mN).signedAdd((mN & 1) == 0, Z.ONE);
    }
    return mA;
  }
}

