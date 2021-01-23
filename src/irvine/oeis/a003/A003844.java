package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003844 Order of universal Chevalley group D_5(q), q = prime power.
 * @author Sean A. Irvine
 */
public class A003844 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003830.orderUniversalChevalleyD(super.next(), 5);
  }
}
