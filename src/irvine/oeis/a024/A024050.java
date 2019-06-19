package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000351;

/**
 * A024050 <code>a(n) = 5^n - n</code>.
 * @author Sean A. Irvine
 */
public class A024050 extends A000351 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
