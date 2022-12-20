package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060713 Smallest number whose digit sum is 5^n.
 * @author Sean A. Irvine
 */
public class A060713 extends Sequence1 {

  // After Harry J. Smith

  private int mN = -1;

  @Override
  public Z next() {
    final Z s = Z.FIVE.pow(++mN);
    final Z x = s.divide(9);
    final Z d = s.subtract(x.multiply(9));
    return d.add(1).multiply(Z.TEN.pow(x)).subtract(1);
  }
}
