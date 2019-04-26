package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A306546 allocated for Aidan Simmons.
 * @author Sean A. Irvine
 */
public class A306546 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.makeOdd() : mN.multiply(3).add(1);
  }
}
