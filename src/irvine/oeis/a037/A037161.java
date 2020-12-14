package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037161 Well-order the rational numbers; take numerators.
 * @author Sean A. Irvine
 */
public class A037161 implements Sequence {

  private final TreeSet<Q> mA = new TreeSet<>();
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 1) {
        mA.add(Q.ZERO);
      } else {
        for (long k = 1; k < mN; ++k) {
          final long q = mN - k;
          if (LongUtils.gcd(k, q) == 1) {
            final Q t = new Q(k, q);
            mA.add(t);
            mA.add(t.negate());
          }
        }
      }
    }
    return select(mA.pollFirst());
  }
}
