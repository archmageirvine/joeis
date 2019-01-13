package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003933.
 * @author Sean A. Irvine
 */
public class A003933 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003920.orderUniversalChevalleyB(super.next(), 4);
  }
}
