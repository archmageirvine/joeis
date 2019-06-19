package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008454;

/**
 * A024008 <code>a(n) = 1 - n^10</code>.
 * @author Sean A. Irvine
 */
public class A024008 extends A008454 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
