package irvine.oeis.a061;
// manually 2012-07-20

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061433 Largest n-digit square.
 * a(n) = floor(sqrt(10^n-1))^2
 * @author Georg Fischer
 */
public class A061433 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return CR.TEN.pow(mN).subtract(CR.ONE).sqrt().floor().square();
  }
}
