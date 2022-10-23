package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A049479 Smallest prime dividing 2^n - 1.
 * @author Sean A. Irvine
 */
public class A049479 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return Jaguar.factor(Z.ONE.shiftLeft(++mN).subtract(1)).leastPrimeFactor();
  }
}
