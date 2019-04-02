package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005969 Sum of fourth powers of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005969 extends A000045 {

  private Z mSum = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(4));
    return mSum;
  }
}
