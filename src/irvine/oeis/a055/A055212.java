package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a033.A033273;

/**
 * A055212 Number of composite divisors of n.
 * @author Sean A. Irvine
 */
public class A055212 extends A033273 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
