package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077625 Largest term in periodic part of continued fraction expansion of square root of -1+2^n or 0 if -1+2^n is square.
 * @author Sean A. Irvine
 */
public class A077625 extends A077624 {

  private long mN = 0;

  @Override
  public Z next() {
    return maxTerm(Z.ONE.shiftLeft(++mN).subtract(1));
  }
}
