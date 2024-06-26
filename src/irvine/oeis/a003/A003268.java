package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003268 Central Fibonomial coefficients.
 * @author Sean A. Irvine
 */
public class A003268 extends Sequence0 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = mN / 2 + 1; k <= mN; ++k) {
      p = p.multiply(Functions.FIBONACCI.z(k));
    }
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      p = p.divide(Functions.FIBONACCI.z(k));
    }
    return p;
  }

}
