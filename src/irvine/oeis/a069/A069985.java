package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069985 Numerator of b(n) = binomial(2n,n)^3*(42n+5)/2^(12n+4).
 * @author Sean A. Irvine
 */
public class A069985 extends Sequence0 {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(Binomial.binomial(2 * ++mN, mN).pow(3).multiply(42 * mN + 5), Z.ONE.shiftLeft(12 * mN + 4)));
  }
}

