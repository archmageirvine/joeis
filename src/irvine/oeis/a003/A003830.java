package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003830 Order of universal Chevalley group D_n (3).
 * @author Sean A. Irvine
 */
public class A003830 implements Sequence {

  private long mN = 0;

  static Z orderUniversalChevalleyD(final Z q, final long n) {
    Z p = q.pow(n * (n - 1)).multiply(q.pow(n).subtract(1));
    for (long k = 1; k < n; ++k) {
      p = p.multiply(q.pow(2 * k).subtract(1));
    }
    return p;
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderUniversalChevalleyD(q(), ++mN);
  }
}
