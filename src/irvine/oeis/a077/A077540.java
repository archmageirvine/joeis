package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077540 a(n) = smallest multiple of the product of next n natural numbers which is a product of consecutive numbers starting with (k+1) where k = n(n+1)/2 = the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A077540 extends Sequence1 {

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
    return p;
  }
}
