package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033465 First differences of sequence {1/(n^2+1)} (numerators).
 * @author Sean A. Irvine
 */
public class A033465 extends Sequence0 {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(1, ++mN * mN + 1).subtract(new Q(1, (mN + 1) * (mN + 1) + 1)));
  }
}

