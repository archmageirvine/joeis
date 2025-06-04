package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077630 Sum of terms in periodic part of continued fraction expansion of square root of 1+3^n.
 * @author Sean A. Irvine
 */
public class A077630 extends A077628 {

  private long mN = 0;

  @Override
  public Z next() {
    return sum(Z.THREE.pow(++mN).add(1));
  }
}
