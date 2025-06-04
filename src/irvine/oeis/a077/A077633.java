package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077633 LCM of terms in periodic part of continued fraction expansion of square root of -1+2^n.
 * @author Sean A. Irvine
 */
public class A077633 extends A077632 {

  private long mN = 0;

  @Override
  public Z next() {
    return lcm(Z.ONE.shiftLeft(++mN).subtract(1));
  }
}
