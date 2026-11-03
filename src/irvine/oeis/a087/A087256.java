package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087256 Number of different initial values for 3x+1 trajectories in which the largest term appearing in the iteration is 2^n.
 * @author Sean A. Irvine
 */
public class A087256 extends Sequence1 {

  private Z mN = Z.ONE;

  private Z f(final Z n, final Z m) {
    Z res = Z.ONE;
    final Z n2 = n.multiply2();
    if (n2.compareTo(m) <= 0) {
      res = res.add(f(n2, m));
    }
    if (n.mod(6) == 4) {
      res = res.add(f(n.divide(3), m));
    }
    return res;
  }

  @Override
  public Z next() {
    mN = mN.multiply2();
    return Z.FOUR.equals(mN) ? Z.ONE : f(mN, mN);
  }
}
