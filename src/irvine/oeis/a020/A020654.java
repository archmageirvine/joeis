package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020654.
 * @author Sean A. Irvine
 */
public class A020654 extends A020655 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
