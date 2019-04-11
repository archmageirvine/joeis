package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a007.A007617;

/**
 * A005277 Nontotients: even n such that phi(m) <code>= n</code> has no solution.
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

