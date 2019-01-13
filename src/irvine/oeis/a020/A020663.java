package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020663.
 * @author Sean A. Irvine
 */
public class A020663 extends A020664 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
