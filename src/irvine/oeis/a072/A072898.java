package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072898 Numerator of c(n) where c(0)=1, c(n+1) = n/c(n) + 1.
 * @author Sean A. Irvine
 */
public class A072898 extends Sequence0 {

  private long mN = -1;
  private Q mC = Q.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mC = Q.valueOf(mN - 1).divide(mC).add(1);
    }
    return select(mC);
  }
}

