package irvine.oeis.a056;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A056616 Numerator of binomial(2n,n)/(2n+1).
 * @author Sean A. Irvine
 */
public class A056616 extends A000984 {

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(super.next(), Z.valueOf(2 * mN + 1)));
  }
}

