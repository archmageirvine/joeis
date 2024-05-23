package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082042 a(n) = (n^2+1)*n!.
 * @author Sean A. Irvine
 */
public class A082042 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.valueOf(mN).square().add(1));
  }
}

