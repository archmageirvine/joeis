package irvine.oeis.a120;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A120883 (1/4)*number of lattice points with odd indices in a square lattice inside a circle around the origin with radius 2*n.
 * @author Sean A. Irvine
 */
public class A120883 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Q s = new Q(mN * mN);
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(CR.valueOf(s.subtract(new Q(k).subtract(Q.HALF).square())).sqrt().subtract(CR.HALF).ceil());
    }
    return sum;
  }
}
