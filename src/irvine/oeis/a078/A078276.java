package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078276 a(n) = A078275(n)/11.
 * @author Sean A. Irvine
 */
public class A078276 extends A078275 {

  @Override
  public Z next() {
    return super.next().divide(11);
  }
}

