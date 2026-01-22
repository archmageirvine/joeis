package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392570 a(n) = numerator(b(n)), where b(n) = b(n-1) + n if n is odd and b(n-1)*n/(b(n-1) + n) if n is even, with b(0) = 0.
 * @author Sean A. Irvine
 */
public class A392570 extends Sequence0 {

  // a(n) = numerator(b(n)), where b(n) = b(n-1) + n if n is odd and b(n-1)*n/(b(n-1) + n) if n is even, with b(0) = 0.

  private Q mB = Q.ZERO;
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mB = (mN & 1) == 1 ? mB.add(mN) : mB.multiply(mN).divide(mB.add(mN));
    }
    return select(mB);
  }
}
