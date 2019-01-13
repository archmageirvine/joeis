package irvine.oeis.a010;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010748.
 * @author Sean A. Irvine
 */
public class A010748 extends MemoryFunction1<Z> implements Sequence {

  private int mN = 3;

  @Override
  protected Z compute(final int n) {
    if (n < 4) {
      return n == 0 ? Z.ONE : Z.ZERO;
    } else {
      Z sum = Z.ZERO;
      for (int k = 0; k <= n - 4; ++k) {
        sum = sum.add(Binomial.binomial(n - 4, k).multiply(get(k)));
      }
      return sum;
    }
  }

  @Override
  public Z next() {
    return get(++mN);
  }
}
