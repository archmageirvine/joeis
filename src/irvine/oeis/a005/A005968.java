package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005968 Sum of cubes of first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005968 extends A000045 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(3));
    return mSum;
  }
}
