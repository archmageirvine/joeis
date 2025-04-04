package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076413 Number of ways n is expressible as the least common multiple of a nonempty set of positive integers not containing either 1 or n.
 * @author Sean A. Irvine
 */
public class A076413 extends A076078 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE.shiftLeft(Functions.SIGMA0.l(++mN) - 1)).divide2();
  }
}
