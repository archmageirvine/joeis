package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002309 Sum of fourth powers of first n odd numbers.
 * @author Sean A. Irvine
 */
public class A002309 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(48).subtract(40).multiply(n2).add(7).multiply(mN).divide(15);
  }
}
