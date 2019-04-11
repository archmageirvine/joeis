package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006041 <code>a(n+1) = (n^2 - 1)*a(n) + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A006041 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN * mN - 1).add(mN + 1);
    }
    return mA;
  }
}

