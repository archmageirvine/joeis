package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000082;

/**
 * A033196 <code>a(n) = n^3*Product_{p|n} (1 + 1/p)</code>.
 * @author Sean A. Irvine
 */
public class A033196 extends A000082 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
