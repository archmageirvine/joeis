package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003837 Order of (usually) simple Chevalley group <code>D_n (3)</code>.
 * @author Sean A. Irvine
 */
public class A003837 implements Sequence {

  private int mN = 0;

  static Z orderSimpleChevalleyD(final Z q, final int n) {
    return A003830.orderUniversalChevalleyD(q, n).divide(Z.FOUR.gcd(q.pow(n).subtract(1)));
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderSimpleChevalleyD(q(), ++mN);
  }
}
