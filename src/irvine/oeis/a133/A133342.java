package irvine.oeis.a133;
// manually 2021-07-21

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a033.A033308;

/**
 * A133342 Concatenation of binary expansion of n-th row of Pascal's triangle.
 * @author Georg Fischer
 */
public class A133342 extends A033308 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= mN; ++k) {
      sb.append(Binomial.binomial(mN, k).toString(2));
    }
    return new Z(sb);
  }
}
