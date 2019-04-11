package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A185098 <code>a(n) = floor((265/6)*4^(n-4) - n^2 - ((15+(-1)^(n-1))/6)* 2^(n-3))</code>.
 * @author Sean A. Irvine
 */
public class A185098 implements Sequence {

  private int mN = 3;

  // Floor((265)*(4^(n-4))/6-(6*n^2 + ((15+(-1)^(n-1)))*(2^(n-3)))/6).

  @Override
  public Z next() {
    ++mN;
    final Z c = Z.ONE.shiftLeft(2 * mN - 8).multiply(265);
    final int a = ((mN & 1) == 0) ? 14 : 16;
    final Z b = Z.ONE.shiftLeft(mN - 3).multiply(a).add(6L * mN * mN);
    return c.subtract(b).divide(6);
  }
}
