package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069581 extends Sequence3 {

  private long mN = 1;
  private long mM = 0;

  private long count(Q n) {
    Z den = Z.THREE;
    long cnt = 0;
    while (!n.num().equals(Z.ONE)) {
      final Q t = new Q(Z.ONE, den);
      final Q u = n.subtract(t);
      if (u.signum() >= 0) {
        ++cnt;
        n = u;
        den = n.reciprocal().toZ().or(Z.ONE);
      } else {
        den = den.add(2);
      }
    }
    return cnt + 1; // +1 for the remaining 1/x piece
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mN += 2;
      mM = 2;
    }
    return Z.valueOf(count(new Q(mM, mN)));
  }
}
