package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003939.
 * @author Sean A. Irvine
 */
public class A003939 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003927.orderSimpleChevalleyB(super.next(), 3);
  }
}
