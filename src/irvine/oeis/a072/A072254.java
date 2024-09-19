package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a007.A007534;

/**
 * A072248.
 * @author Sean A. Irvine
 */
public class A072254 extends A007534 {

  @Override
  public Z next() {
    final Z res = super.next().divide2();
    super.next();
    super.next();
    return res;
  }
}
