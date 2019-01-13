package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003850.
 * @author Sean A. Irvine
 */
public class A003850 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003837.orderSimpleChevalleyD(super.next(), 4);
  }
}
