package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a007.A007497;

/**
 * A051572 a(1) = 5, a(n) = sigma(a(n-1)).
 * @author Sean A. Irvine
 */
public class A051572 extends A007497 {

  @Override
  protected Z start() {
    return Z.FIVE;
  }
}

