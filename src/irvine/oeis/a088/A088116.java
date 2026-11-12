package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A088116 Let n = abc..., where a, b, c, are digits of n. a(n) = a*bc...+b*ac...+c*ab...+..., i.e., a(n) = sum, over all the digits, of the product (number obtained by deleting a digit multiplied by the deleted digit).
 * @author Sean A. Irvine
 */
public class A088116 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    Z t = n;
    Z m = Z.ONE;
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(10);
      final Z d = qr[1];
      t = qr[0];
      final Z u = t.multiply(m).add(n.mod(m));
      sum = sum.add(u.multiply(d));
      m = m.multiply(10);
    }
    return sum;
  }

}
