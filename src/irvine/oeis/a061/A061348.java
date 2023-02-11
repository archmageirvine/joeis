package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061348 Consider a (solid) triangle with n cells on each edge, for a total of n(n+1)/2 cells; a(n) is number of inequivalent ways of labeling cells with 0's and 1's; triangle may be rotated and turned over.
 * @author Sean A. Irvine
 */
public class A061348 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int a = mN * (mN + 1) / 2;
    final int v = (mN + 1) / 2;
    final int t1 = mN % 3 == 1 ? (mN * (mN + 1) + 4) / 6 : (mN * (mN + 1) / 6);
    return Z.ONE.shiftLeft(a).add(Z.ONE.shiftLeft(t1 + 1).add(Z.THREE.shiftLeft((a + v) / 2))).divide(6);
  }
}
