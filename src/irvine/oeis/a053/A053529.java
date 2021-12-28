package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A053529 a(n) = n! * number of partitions of n.
 * @author Sean A. Irvine
 */
public class A053529 extends A000041 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return p.multiply(mF);
  }
}
