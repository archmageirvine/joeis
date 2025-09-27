package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006512;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A080701 extends A006512 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(Functions.PRIME.z(p));
  }
}
