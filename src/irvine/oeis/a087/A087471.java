package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087471 Final digit resulting from iterations of the product of the two numbers formed from the alternating digits of n.
 * @author Sean A. Irvine
 */
public class A087471 extends Sequence1 {

  private long mN = 0;

  static Z murphyProduct(Z n) {
    if (n.compareTo(Z.TEN) < 0) {
      return n;
    }
    Z a = Z.ZERO;
    Z b = Z.ZERO;
    Z m = Z.ONE;
    while (!n.isZero()) {
      final Z[] qra = n.divideAndRemainder(Z.TEN);
      a = a.add(qra[1].multiply(m));
      n = qra[0];
      final Z[] qrb = n.divideAndRemainder(Z.TEN);
      b = b.add(qrb[1].multiply(m));
      n = qrb[0];
      m = m.multiply(10);
    }
    return a.multiply(b);
  }

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    Z u;
    do {
      u = t;
      t = murphyProduct(t);
    } while (!t.equals(u));
    return t;
  }
}
