package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077542 Least number of terms required in the product (k+1)*(k+2)*... to make it a multiple of the product of next n numbers, where k = n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A077542 extends Sequence1 {

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
    long k = 1;
    while (!p.mod(prod).isZero()) {
      t = t.add(1);
      p = p.multiply(t);
      ++k;
    }
    return Z.valueOf(k);
  }
}
