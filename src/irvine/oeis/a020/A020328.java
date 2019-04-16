package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020328.
 * @author Sean A. Irvine
 */
public class A020328 implements Sequence {

  private static final Q FOUR = new Q(4);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    final Q t = new Q(1, mN);
    for (long a = mN + 1; a <= 5 * mN; ++a) {
      final Q t1 = t.subtract(new Q(1, a));
      final long l4 = FOUR.divide(t1).toZ().longValue();
      for (long b = Math.max(t1.reciprocal().toZ().longValue() + 1, a); b <= l4; ++b) {
        final Q t2 = t1.subtract(new Q(1, b));
        final long l3 = Q.THREE.divide(t2).toZ().longValue();
        for (long c = Math.max(t2.reciprocal().toZ().longValue() + 1, b); c <= l3; ++c) {
          final Q t3 = t2.subtract(new Q(1, c));
          final long l2 = Q.TWO.divide(t3).toZ().longValue();
          for (long d = Math.max(t3.reciprocal().toZ().longValue() + 1, c); d <= l2; ++d) {
            final Q e = t3.subtract(new Q(1, d)).reciprocal();
            if (e.isInteger() && e.toZ().longValue() >= d) {
              ++s;
            }
          }
        }
      }
    }
    return Z.valueOf(s);
  }
}
