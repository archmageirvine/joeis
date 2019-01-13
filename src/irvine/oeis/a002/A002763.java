package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A002763.
 * @author Sean A. Irvine
 */
public class A002763 extends A054225 {

  private static final Z P = Z.valueOf(45);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = P.shiftLeft(++mN);
    return get(r, r);
  }
}
