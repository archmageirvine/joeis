package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a178.A178963;

/**
 * A002115 Generalized Euler numbers.
 * @author Sean A. Irvine
 */
public class A002115 extends A178963 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    super.next();
    return r;
  }
}
