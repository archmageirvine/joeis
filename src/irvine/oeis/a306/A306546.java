package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A306546 Modified Collatz Map such that odd numbers are treated the same, but even numbers have all factors of 2 removed.
 * @author Sean A. Irvine
 */
public class A306546 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.makeOdd() : mN.multiply(3).add(1);
  }
}
