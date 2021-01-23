package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034959 Divide even numbers into groups with prime(n) elements and add together.
 * @author Sean A. Irvine
 */
public class A034959 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z sum = mN.multiply(p).add(p.square().subtract(p));
    mN = mN.add(p.multiply2());
    return sum;
  }
}
