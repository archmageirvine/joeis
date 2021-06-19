package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048485 a(n) = floor(n/2) - A048475(n).
 * @author Sean A. Irvine
 */
public class A048485 extends A048475 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN / 2).negate();
  }
}
