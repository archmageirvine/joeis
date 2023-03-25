package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a007.A007617;

/**
 * A005277 Nontotients: even numbers k such that phi(m) = k has no solution.
 * @author Sean A. Irvine
 */
public class A005277 extends A007617 {

  @Override
  public Z next() {
    Z a;
    while (!(a = super.next()).isEven()) {
      // do nothing
    }
    return a;
  }
}

