package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048484 a(n) = abs(floor(n/2) - A048299(n)).
 * @author Sean A. Irvine
 */
public class A048484 extends A048299 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN / 2).abs();
  }
}
