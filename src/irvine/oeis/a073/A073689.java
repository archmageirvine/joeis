package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073689.
 * @author Sean A. Irvine
 */
public class A073689 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = ++mN;
    Z prod = Z.valueOf(t);
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++mN);
    }
    return Z.valueOf(t);
  }
}
