package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048581 Numerators of b(n) = (1/16^n)*(4/(8*n+1) - 2/(8*n+4) - 1/(8*n+5) - 1/(8*n+6)).
 * @author Sean A. Irvine
 */
public class A048581 extends Sequence0 {

  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(4, 8L * ++mN + 1)
      .subtract(new Q(2, 8L * mN + 4))
      .subtract(new Q(1, 8L * mN + 5))
      .subtract(new Q(1, 8L * mN + 6))
      .divide(Z.ONE.shiftLeft(4L * mN))
    );
  }
}

