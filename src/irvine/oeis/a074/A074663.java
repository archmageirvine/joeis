package irvine.oeis.a074;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A074663 a(n) = sum of n-th row of the triangle formed by replacing each m in Pascal's triangle with the m-th prime.
 * @author Sean A. Irvine
 */
public class A074663 extends A074589 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
