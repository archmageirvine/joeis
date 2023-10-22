package irvine.oeis.a366;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A366671 Smallest prime dividing 8^n + 1.
 * @author Sean A. Irvine
 */
public class A366671 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(Z.ONE.shiftLeft(3L * ++mN).add(1));
  }
}
