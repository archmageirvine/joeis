package irvine.oeis.a156;
// manually at 2024-01-17; corr. 2024-02-03

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005941;

/**
 * A156552 Unary-encoded compressed factorization of natural numbers.
 * @author Georg Fischer
 */
public class A156552 extends A005941 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return super.a(n).subtract(1);
  }

  @Override
  public Z a(final int n) {
    return super.a(Z.valueOf(n)).subtract(1);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
