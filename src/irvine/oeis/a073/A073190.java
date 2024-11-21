package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073190 Number of general plane trees which are either empty (the case a(0)), or whose root degree is either 1 (i.e., the planted trees) or the two leftmost subtrees (of the root node) are identical.
 * @author Sean A. Irvine
 */
public class A073190 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Functions.CATALAN.z(mN - 1);
    for (long k = 0; k <= mN - 2; k += 2) {
      sum = sum.add(Functions.CATALAN.z(k / 2).multiply(Functions.CATALAN.z(mN - 2 - k)));
    }
    return sum;
  }
}
