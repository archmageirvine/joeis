package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a003.A003824;

/**
 * A018850.
 * @author Sean A. Irvine
 */
public class A018850 extends A003824 {

  @Override
  protected Z a(final Z n) {
    return n.pow(3);
  }

  @Override
  protected int count() {
    return 3;
  }
}
