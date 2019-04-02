package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004194 Number of partitions of 1/n into 3 reciprocals of positive integers.
 * @author Sean A. Irvine
 */
public class A004194 implements Sequence {

  // After Charles R. Greathouse IV

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    final Q t = new Q(1, mN);
    for (long a = mN + 1; a <= 3 * mN; ++a) {
      final Q t1 = t.subtract(new Q(1, a));
      final long l2 = Q.TWO.divide(t1).toZ().longValue();
      for (long b = Math.max(t1.reciprocal().toZ().longValue() + 1, a); b <= l2; ++b) {
        final Q c = t1.subtract(new Q(1, b)).reciprocal();
        if (c.isInteger() && c.toZ().longValue() >= b) {
          ++s;
        }
      }
    }
    return Z.valueOf(s);
  }
}
