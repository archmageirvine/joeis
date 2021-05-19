package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047767 a(n) = A047765(2n).
 * @author Sean A. Irvine
 */
public class A047767 extends A047765 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

