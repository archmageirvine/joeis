package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003920 Order of universal Chevalley group B_n (3).
 * @author Sean A. Irvine
 */
public class A003920 implements Sequence {

  private long mN = start();

  static Z orderUniversalChevalleyB(final Z q, final long n) {
    Z p = q.pow(n * n);
    for (long k = 1; k <= n; ++k) {
      p = p.multiply(q.pow(2 * k).subtract(1));
    }
    return p;
  }

  protected int start() {
    return 0;
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderUniversalChevalleyB(q(), ++mN);
  }
}
