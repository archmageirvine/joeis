package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a178.A178446;

/**
 * A039907 Number of perfect matchings in triangle graph with n nodes per side.
 * @author Sean A. Irvine
 */
public class A039907 extends A178446 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    return ((++mN * (mN + 1)) & 2) == 0 ? t : Z.ZERO;
  }
}
