package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003935.
 * @author Sean A. Irvine
 */
public class A003935 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003920.orderUniversalChevalleyB(super.next(), 6);
  }
}
