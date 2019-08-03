package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025010.
 * @author Sean A. Irvine
 */
public class A025010 extends A025000 {

  @Override
  protected Z initial() {
    return Z.FIVE;
  }

  @Override
  protected Z start() {
    return Z.FOUR;
  }
}
