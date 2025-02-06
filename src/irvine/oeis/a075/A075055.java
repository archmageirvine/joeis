package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075055 Smallest integer of the form product (n+1)(n+2)...(n+k)/n!.
 * @author Sean A. Irvine
 */
public class A075055 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    Z prod = Z.ONE;
    long k = 0;
    while (!prod.mod(f).isZero()) {
      prod = prod.multiply(mN + ++k);
    }
    return prod.divide(f);
  }
}
