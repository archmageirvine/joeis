package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A003680 Smallest number with <code>2n</code> divisors.
 * @author Sean A. Irvine
 */
public class A003680 extends A005179 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
