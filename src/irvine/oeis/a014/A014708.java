package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000521;

/**
 * A014708 Coefficients of the modular function J = j - 744.
 * @author Sean A. Irvine
 */
public class A014708 extends A000521 {

  private int mN = -2;

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 0) ? Z.ZERO : result;
  }
}

