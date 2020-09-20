package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034957 Divide natural numbers in groups with prime(n) elements and add together.
 * @author Sean A. Irvine
 */
public class A034957 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z sum = mN.multiply(p).add(p.square().subtract(p).divide2());
    mN = mN.add(p);
    return sum;
  }
}
