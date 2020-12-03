package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031349 3-multiplicative persistence: number of iterations of "multiply 3rd powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031349 implements Sequence {

  private long mN = 0;

  protected int pow() {
    return 3;
  }

  private Z digitProductPower(final Z n) {
    Z m = n.abs();
    Z p = Z.ONE;
    do {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      p = p.multiply(qr[1].pow(pow()));
      m = qr[0];
    } while (!m.isZero() && !p.isZero());
    return p;
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (Z.ONE.compareTo(m) < 0) {
      ++cnt;
      m = digitProductPower(m);
    }
    return Z.valueOf(cnt);
  }
}

