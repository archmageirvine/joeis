package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.a138.A138793;

/**
 * A104759 Concatenation of digits of natural numbers from n down to 1.
 * @author Georg Fischer
 */
public class A104759 extends A138793 {

  private Z mTen = Z.TEN;

  {
    super.next();
  }

  @Override
  public Z next() {
    // a(n) = A138793(n) mod 10^(n-1).
    final Z result = super.next().mod(mTen);
    mTen = mTen.multiply(10);
    return result;
  }
}
