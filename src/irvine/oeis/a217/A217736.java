package irvine.oeis.a217;
// manually partsumm/partsum at 2022-04-12 19:21

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A217736 Sum of first n squares of semiprimes.
 * @author Georg Fischer
 */
public class A217736 extends A001358 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().square());
    return mSum;
  }
}
