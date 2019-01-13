package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003441.
 * @author Sean A. Irvine
 */
public class A003441 extends A000108 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Q c = (mN - 1) % 3 == 0 ? new Q(super.next().multiply2(), Z.THREE) : Q.ZERO;
    return c.add(new Q(Binomial.binomial(2 * mN + 1, mN - 1), Z.valueOf(2 * mN + 1))).toZ();
  }

}

