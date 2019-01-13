package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003942.
 * @author Sean A. Irvine
 */
public class A003942 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003927.orderSimpleChevalleyB(super.next(), 6);
  }
}
