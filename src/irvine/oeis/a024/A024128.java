package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001020;

/**
 * A024128 <code>a(n) = 11^n - n</code>.
 * @author Sean A. Irvine
 */
public class A024128 extends A001020 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
