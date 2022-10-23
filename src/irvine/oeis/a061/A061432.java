package irvine.oeis.a061;
// manually 2012-07-20

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061432 a(n) = smallest n-digit square.
 * a(n) = ceil(sqrt(10^n))^2
 * @author Georg Fischer
 */
public class A061432 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return CR.TEN.pow(mN).sqrt().ceil().square();
  }
}
