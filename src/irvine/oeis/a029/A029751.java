package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029751 Average theta series of odd unimodular lattices in dimension 12.
 * @author Sean A. Irvine
 */
public class A029751 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      sum = sum.signedAdd(((mN / dd.longValueExact()) & 1) == 0, dd.pow(5));
    }
    return sum.abs().multiply(8);
  }
}
