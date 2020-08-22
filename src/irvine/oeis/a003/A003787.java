package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003787 Order of universal Chevalley group A_n (3).
 * @author Sean A. Irvine
 */
public class A003787 implements Sequence {

  private int mN = -1;

  static Z orderUniversalChevalleyA(final Z q, final int n) {
    Z p = q.pow(n * (n + 1) / 2);
    Z qPower = q;
    for (int k = 2; k <= n + 1; ++k) {
      qPower = qPower.multiply(q);
      p = p.multiply(qPower.subtract(1));
    }
    return p;
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderUniversalChevalleyA(q(), ++mN);
  }
}
