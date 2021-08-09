package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031342 a(n) = prime(9*n).
 * @author Sean A. Irvine
 */
public class A031342 extends A031336 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}

