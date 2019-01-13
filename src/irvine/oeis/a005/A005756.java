package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a225.A225171;

/**
 * A005756.
 * @author Sean A. Irvine
 */
public class A005756 extends A225171 {

  private int mN = 1;

  @Override
  public Z next() {
    return and(++mN, 2);
  }
}
