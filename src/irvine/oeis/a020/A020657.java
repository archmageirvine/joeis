package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020657.
 * @author Sean A. Irvine
 */
public class A020657 extends A020658 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
