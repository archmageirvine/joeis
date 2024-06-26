package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001863 Normalized total height of rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A001863 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z m = Z.ONE;
    for (int k = 0; k <= mN - 2; ++k) {
      s = s.add(Functions.FACTORIAL.z(mN - 2).multiply(m).divide(Functions.FACTORIAL.z(k)));
      m = m.multiply(mN);
    }
    return s;
  }
}
