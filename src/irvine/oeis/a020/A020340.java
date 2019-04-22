package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020340.
 * @author Sean A. Irvine
 */
public class A020340 extends A020339 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
