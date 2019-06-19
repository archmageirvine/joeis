package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000400;

/**
 * A024062 <code>a(n) = 6^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A024062 extends A000400 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
