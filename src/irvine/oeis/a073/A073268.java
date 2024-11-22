package irvine.oeis.a073;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073268 Number of plane binary trees whose right (or respectively: left) subtree is a unique "complete" tree of (2^m)-1 nodes with all the leaf-nodes at the same depth m and the left (or respectively: right) subtree is any plane binary tree of size n - 2^m + 1.
 * @author Sean A. Irvine
 */
public class A073268 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, IntegerUtils.floorLog2(mN), k -> Functions.CATALAN.z(mN - (1 << k)));
  }
}
