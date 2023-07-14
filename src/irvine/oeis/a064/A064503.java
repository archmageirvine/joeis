package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064503 Bisection of A064394.
 * @author Sean A. Irvine
 */
public class A064503 extends A064394 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}
