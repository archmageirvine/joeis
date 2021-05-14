package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000980;

/**
 * A047653 Constant term in expansion of (1/2) * Product_{k=-n..n} (1 + x^k).
 * @author Sean A. Irvine
 */
public class A047653 extends A000980 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
