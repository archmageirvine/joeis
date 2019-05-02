package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020892.
 * @author Sean A. Irvine
 */
public class A020892 extends A020891 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
