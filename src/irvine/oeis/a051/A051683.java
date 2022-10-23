package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051683 Triangle read by rows: T(n,k) = n!*k.
 * @author Sean A. Irvine
 */
public class A051683 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      mF = mF.multiply(++mN);
      mM = 1;
    }
    return mF.multiply(mM);
  }
}
