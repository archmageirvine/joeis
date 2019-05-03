package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000930;

/**
 * A002478 Bisection of <code>A000930</code>.
 * @author Sean A. Irvine
 */
public class A002478 extends A000930 {
  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}
