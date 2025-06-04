package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077634 LCM of terms in periodic part of continued fraction expansion of square root of 1+3^n.
 * @author Sean A. Irvine
 */
public class A077634 extends A077632 {

  private long mN = 0;

  @Override
  public Z next() {
    return lcm(Z.THREE.pow(++mN).add(1));
  }
}
