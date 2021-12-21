package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.a003.A003484;

/**
 * A209675 Radon function at even positions: a(n) = A003484(2*n).
 * @author Sean A. Irvine
 */
public class A209675 extends A003484 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
