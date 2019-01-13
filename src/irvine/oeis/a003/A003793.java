package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003793.
 * @author Sean A. Irvine
 */
public class A003793 implements Sequence {

  private int mN = -1;

  static Z orderSimpleChevalleyA(final Z q, final int n) {
    return A003787.orderUniversalChevalleyA(q, n).divide(q.subtract(1).gcd(Z.valueOf(n + 1)));
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderSimpleChevalleyA(q(), ++mN);
  }
}
