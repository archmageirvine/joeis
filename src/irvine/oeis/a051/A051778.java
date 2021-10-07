package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051778 Triangle read by rows, where row (n) = n mod (n-1), n mod (n-2), n mod (n-3), ...n mod 2.
 * @author Sean A. Irvine
 */
public class A051778 implements Sequence {

  private Z mN = Z.TWO;
  private Z mM = Z.TWO;

  @Override
  public Z next() {
    mM = mM.subtract(1);
    if (Z.ONE.equals(mM)) {
      mM = mN;
      mN = mN.add(1);
    }
    return mN.mod(mM);
  }
}
