package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001564 2nd differences of factorial numbers.
 * @author Sean A. Irvine
 */
public class A001564 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.valueOf(mN).multiply(mN).add(mN + 1));
  }
}
