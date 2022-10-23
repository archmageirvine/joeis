package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006335 a(n) = 4^n*(3*n)!/((n+1)!*(2*n+1)!).
 * @author Sean A. Irvine
 */
public class A006335 extends Sequence0 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    ++mN;
    mA = mA == null ? Z.ONE : mA.multiply(3 * mN - 1).multiply(3 * mN - 2).multiply(6).divide(mN + 1).divide(2 * mN + 1);
    return mA;
  }
}

