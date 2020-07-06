package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A033198 Discriminants of real quadratic number fields.
 * @author Sean A. Irvine
 */
public class A033198 extends A005117 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return n.mod(4) == 1 ? n : n.multiply(4);
  }
}
