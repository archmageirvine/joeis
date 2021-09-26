package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051726 Numerator of n(n-1)(n-2)/720.
 * @author Sean A. Irvine
 */
public class A051726 implements Sequence {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(new Q(++mN, 720).multiply(mN - 1).multiply(mN - 2));
  }
}
