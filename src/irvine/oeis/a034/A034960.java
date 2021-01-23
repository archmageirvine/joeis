package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034960 Divide odd numbers into groups with prime(n) elements and add together.
 * @author Sean A. Irvine
 */
public class A034960 extends A000040 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z sum = mN.multiply(p).add(p.square().subtract(p));
    mN = mN.add(p.multiply2());
    return sum;
  }
}
