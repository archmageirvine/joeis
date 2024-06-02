package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070066 Values of y in positive integer solutions of x^2 + y^5 = z^3, listed in increasing order of z. (If a z-value occurs twice, list solutions in increasing order of y.).
 * @author Sean A. Irvine
 */
public class A070066 extends A070067 {

  @Override
  protected Z select(final long z, final long y, final Z x) {
    return Z.valueOf(y);
  }
}
