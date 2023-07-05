package irvine.oeis.a118;
// manually 2023-07-04

import irvine.math.z.Z;
import irvine.oeis.a071.A071053;

/**
 * A118911 Row sums of triangle in A128973.
 * @author Georg Fischer
 */
public class A118911 extends A071053 {

  private int mN = -1;
  private Z mA = super.next();

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return mA;
    } else {
      final Z result = mA;
      mA = super.next();
      return result;
    }
  }
}
