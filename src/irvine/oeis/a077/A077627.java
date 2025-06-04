package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077627 Largest term in periodic part of continued fraction expansion of square root of -1+3^n.
 * @author Sean A. Irvine
 */
public class A077627 extends A077624 {

  private long mN = 0;

  @Override
  public Z next() {
    return maxTerm(Z.THREE.pow(++mN).subtract(1));
  }
}
