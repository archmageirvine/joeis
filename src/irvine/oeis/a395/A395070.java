package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000927;

/**
 * A395070 a(n) is the exponent of the highest power of 2 dividing e(n), where e(n) is the n-th even term of A000927.
 * @author Sean A. Irvine
 */
public class A395070 extends A000927 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return Functions.VALUATION.z(t, 2);
  }
}

