package irvine.oeis.a086;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086812 Number of symmetric invertible n X n matrices over GF(2).
 * @author Sean A. Irvine
 */
public class A086812 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long k = (++mN + 1) / 2;
    final Z s = Z.ONE.shiftLeft(mN * (mN + 1) / 2);
    final Q prod0 = Rationals.SINGLETON.product(1, 2 * k, j -> Q.ONE.subtract(new Q(Z.ONE, Z.ONE.shiftLeft(j))));
    final Q prod1 = Rationals.SINGLETON.product(1, k, j -> Q.ONE.subtract(new Q(Z.ONE, Z.ONE.shiftLeft(2 * j))));
    return prod0.divide(prod1).multiply(s).toZ();
  }
}
