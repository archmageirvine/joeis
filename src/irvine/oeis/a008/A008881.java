package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008881 Product( [ (n+i)/6 <code>] ),</code> i=0..5.
 * @author Sean A. Irvine
 */
public class A008881 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < 6; ++k) {
      prod = prod.multiply((mN + k) / 6);
    }
    return prod;
  }
}


