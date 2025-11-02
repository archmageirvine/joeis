package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081474 Number of distinct lines through the origin in n-dimensional cube of side length n.
 * @author Sean A. Irvine
 */
public class A081474 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.valueOf(mN / k + 1).pow(mN).subtract(1).multiply(Functions.MOBIUS.l(k)));
  }
}
