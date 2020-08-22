package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000302;

/**
 * A024036 a(n) = 4^n - 1.
 * @author Sean A. Irvine
 */
public class A024036 extends A000302 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
