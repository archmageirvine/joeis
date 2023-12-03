package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067080 If n = ab...def in decimal notation then the left digitorial function Ld(n) = ab...def*ab...de*ab...d*...*ab*a.
 * @author Sean A. Irvine
 */
public class A067080 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    while (m != 0) {
      prod = prod.multiply(m);
      m /= 10;
    }
    return prod;
  }
}
