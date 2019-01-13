package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;

/**
 * A002428.
 * @author Sean A. Irvine
 */
public class A002428 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(new Q(1, mN * (2 * k - 1)));
    }
    final Z r = s.num();
    return (mN & 1) == 1 ? r : r.negate();
  }
}
