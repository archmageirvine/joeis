package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000302;

/**
 * A024037 <code>a(n) = 4^n - n</code>.
 * @author Sean A. Irvine
 */
public class A024037 extends A000302 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
