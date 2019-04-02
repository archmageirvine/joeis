package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003927 Order of simple Chevalley group B_n (3).
 * @author Sean A. Irvine
 */
public class A003927 implements Sequence {

  private int mN = start();

  static Z orderSimpleChevalleyB(final Z q, final int n) {
    return A003920.orderUniversalChevalleyB(q, n).divide(Z.TWO.gcd(q.subtract(1)));
  }

  protected int start() {
    return 1;
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderSimpleChevalleyB(q(), ++mN);
  }
}
