package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005095 a(n) = n! + n.
 * @author Sean A. Irvine
 */
public class A005095 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.add(mN);
  }
}

