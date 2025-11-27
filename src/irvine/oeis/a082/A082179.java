package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082174.
 * @author Sean A. Irvine
 */
public class A082179 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.CATALAN.z(p).subtract(2).divide(p);
  }
}
