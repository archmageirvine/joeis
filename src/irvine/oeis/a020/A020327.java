package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020327 Number of partitions of <code>1/n</code> into 4 reciprocals of positive integers.
 * @author Sean A. Irvine
 */
public class A020327 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    final Q t = new Q(1, mN);
    for (long a = mN + 1; a <= 4 * mN; ++a) {
      final Q t1 = t.subtract(new Q(1, a));
      final long l3 = Q.THREE.divide(t1).toZ().longValue();
      for (long b = Math.max(t1.reciprocal().toZ().longValue() + 1, a); b <= l3; ++b) {
        final Q t2 = t1.subtract(new Q(1, b));
        final long l2 = Q.TWO.divide(t2).toZ().longValue();
        for (long c = Math.max(t2.reciprocal().toZ().longValue() + 1, b); c <= l2; ++c) {
          final Q d = t2.subtract(new Q(1, c)).reciprocal();
          if (d.isInteger() && d.toZ().longValue() >= c) {
            ++s;
          }
        }
      }
    }
    return Z.valueOf(s);
  }
}
