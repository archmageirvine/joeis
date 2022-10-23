package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002709 Triangulations of the disk G_{n,0}.
 * @author Sean A. Irvine
 */
public class A002709 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = ++mN % 3;
    if (r == 0) {
      final long k = mN / 3;
      return Binomial.binomial(12 * k - 1, 3 * k - 1).divide(Z.valueOf(6 * k - 1).multiply(12 * k - 1));
    } else if (r == 1) {
      final long k = (mN - 1) / 3;
      return new Q(Binomial.binomial(12 * k + 3, 3 * k), Z.valueOf(4 * k + 1).multiply(6 * k + 1).multiply(3))
        .add(new Q(Binomial.binomial(4 * k, k).multiply2(), Z.valueOf(3 * k + 1).multiply(3))).toZ();
    } else { // r == 2
      final long  k = (mN - 2) / 3;
      return new Q(Binomial.binomial(12 * k + 7, 3 * k + 1), Z.valueOf(2 * k + 1).multiply(12 * k + 7).multiply(3))
        .add(new Q(Binomial.binomial(4 * k + 1, k).shiftLeft(2), Z.valueOf(3 * k + 2).multiply(3))).toZ();
    }
  }
}
