package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051777 Triangle read by rows, where row (n) = n mod n, n mod (n-1), n mod (n-2), ...n mod 1.
 * @author Sean A. Irvine
 */
public class A051777 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.subtract(1);
    if (mM.signum() <= 0) {
      mN = mN.add(1);
      mM = mN;
    }
    return mN.mod(mM);
  }
}
