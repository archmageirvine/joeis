package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068901 Least number that when added to the n-th prime gives a multiple of n.
 * @author Sean A. Irvine
 */
public class A068901 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    return p.add(mN++).divide(mN).multiply(mN).subtract(p);
  }
}
