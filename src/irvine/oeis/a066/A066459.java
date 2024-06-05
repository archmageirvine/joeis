package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066459 Product of factorials of the digits of n.
 * @author Sean A. Irvine
 */
public class A066459 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    do {
      prod = prod.multiply(Functions.FACTORIAL.z(m % 10));
      m /= 10;
    } while (m != 0);
    return prod;
  }
}

