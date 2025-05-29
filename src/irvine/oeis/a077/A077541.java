package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077541 a(n) = A077540(n)/Pr(n), where Pr(n)= product of next n numbers. E.g. Pr(3) = 4*5*6.
 * @author Sean A. Irvine
 */
public class A077541 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(++mM);
    }
    Z t = Functions.TRIANGULAR.z(mN).add(1);
    Z p = t;
    while (!p.mod(prod).isZero()) {
      t = t.add(1);
      p = p.multiply(t);
    }
    return p.divide(prod);
  }
}
