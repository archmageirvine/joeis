package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000351;

/**
 * A024049 a(n) = 5^n - 1.
 * @author Sean A. Irvine
 */
public class A024049 extends A000351 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
