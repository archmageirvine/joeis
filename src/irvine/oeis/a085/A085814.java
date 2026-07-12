package irvine.oeis.a085;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085814 Even entries (A048967) minus the odd entries (A001316) in row n of Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A085814 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      final Z b = Binomial.binomial(mN, k);
      sum = sum.add(b.multiply(Z.NEG_ONE.pow(b)));
    }
    return sum;
  }
}
