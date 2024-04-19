package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000435 Normalized total height of all nodes in all rooted trees with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A000435 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int n1 = mN++;
    final Z f = Functions.FACTORIAL.z(n1);
    Z s = Z.ZERO;
    Z n = Z.ONE;
    for (int k = 0; k <= mN - 2; ++k, n = n.multiply(mN)) {
      s = s.add(n.multiply(f.divide(Functions.FACTORIAL.z(k))));
    }
    return s;
  }
}
