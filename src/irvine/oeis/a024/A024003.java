package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A024003 <code>a(n) = 1 - n^5</code>.
 * @author Sean A. Irvine
 */
public class A024003 extends A000584 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
