package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003928.
 * @author Sean A. Irvine
 */
public class A003928 extends A003927 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }

  @Override
  protected int start() {
    return 0;
  }
}
