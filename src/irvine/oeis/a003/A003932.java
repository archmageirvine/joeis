package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003932 Order of universal Chevalley group <code>B_3(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003932 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003920.orderUniversalChevalleyB(super.next(), 3);
  }
}
