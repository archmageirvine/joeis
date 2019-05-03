package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003937 Order of universal Chevalley group <code>B_8(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003937 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003920.orderUniversalChevalleyB(super.next(), 8);
  }
}
