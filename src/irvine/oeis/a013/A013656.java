package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013656 <code>n*(9*n-2)</code>.
 * @author Sean A. Irvine
 */
public class A013656 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.multiply(9).subtract(2));
  }
}
