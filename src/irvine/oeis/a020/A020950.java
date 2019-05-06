package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020950.
 * @author Sean A. Irvine
 */
public class A020950 extends A020946 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
