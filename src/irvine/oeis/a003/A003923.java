package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003923.
 * @author Sean A. Irvine
 */
public class A003923 extends A003920 {

  @Override
  protected Z q() {
    return Z.TWO;
  }

  @Override
  protected int start() {
    return -1;
  }
}
