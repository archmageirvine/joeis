package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049281 Numerators of coefficients in power series for -log(1+x)*log(1-x).
 * @author Sean A. Irvine
 */
public class A049281 implements Sequence {

  private long mN = 0;
  private Q mSum = Q.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mSum = mSum.subtract(new Q(1, 2 * mN - 2)).add(new Q(1, 2 * mN - 1));
    }
    return select(mSum.divide(mN));
  }
}
