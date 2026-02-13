package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392970 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392970 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z p = Functions.PRIME.z(++mN);
    final Z e = Functions.PRIME.z(p.add(mN - 1)).subtract(p).add(1);
    Z prod = p.pow(e);
    for (int k = 1; k < p.intValueExact(); ++k) {
      prod = prod.multiply(Functions.PRIME.z(k + mN));
    }
    return prod;
  }
}
