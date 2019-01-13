package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005017.
 * @author Sean A. Irvine
 */
public class A005017 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Q a = new Q(Binomial.binomial(2 * mN - 2, mN - 1), mF);
    return a.den().square();
  }

}

