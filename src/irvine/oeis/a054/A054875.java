package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054875 Number of pairwise incongruent triangles with integer sides and positive integer area and longest side of length n.
 * @author Sean A. Irvine
 */
public class A054875 extends Sequence1 {

  // After Amiran Elder

  private long mN = 0;

  protected boolean is(final long x, final long y, final long z) {
    if (x + y <= z) {
      return false;
    }
    final Q s = new Q(x + y + z, 2);
    final Q t = s.multiply(s.subtract(x)).multiply(s.subtract(y)).multiply(s.subtract(z));
    if (!t.isInteger()) {
      return false;
    }
    return t.toZ().isSquare();
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x <= y; ++x) {
        if (is(x, y, mN)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
