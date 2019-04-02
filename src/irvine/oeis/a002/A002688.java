package irvine.oeis.a002;

import irvine.math.z.Z;


/**
 * A002688 Denominators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002688 extends A002687 {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN).den();
  }
}
