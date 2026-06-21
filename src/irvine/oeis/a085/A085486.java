package irvine.oeis.a085;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A085486 Antidiagonal sums of symmetric square table A085484, in which the main diagonal is equal to the first row shift left.
 * @author Sean A. Irvine
 */
public class A085486 extends A085484 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mB.get(mN, k));
  }
}
