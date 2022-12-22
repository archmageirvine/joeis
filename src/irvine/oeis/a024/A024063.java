package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000400;

/**
 * A024063 a(n) = 6^n - n.
 * @author Sean A. Irvine
 */
public class A024063 extends A000400 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
