package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019413.
 * @author Sean A. Irvine
 */
public class A019413 extends A019334 {

  private static final Z Z91 = Z.valueOf(91);

  @Override
  protected Z root() {
    return Z91;
  }
}

