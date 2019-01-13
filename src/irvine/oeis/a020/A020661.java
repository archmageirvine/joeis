package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020661.
 * @author Sean A. Irvine
 */
public class A020661 extends A020662 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
