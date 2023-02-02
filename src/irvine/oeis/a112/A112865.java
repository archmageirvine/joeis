package irvine.oeis.a112;
// manually etman at 2023-02-01 22:30

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A112865 a(n) = (-1)^(n + floor(n/4) + floor(n/4^2) + ...).
 * @author Georg Fischer
 */
public class A112865 extends Sequence0 {

  private int mN = -1;

  private Z f(final int n) {
    return (n == 0) ? Z.ONE : (((n & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(f(n / 4));
  }

  @Override
  public Z next() {
    return f(++mN);
  }
}
