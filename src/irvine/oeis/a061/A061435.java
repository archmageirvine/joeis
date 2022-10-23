package irvine.oeis.a061;
// manually 2012-07-20

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061435 a(n) is the largest n-digit cube.
 * a(n) = (ceil(10^(n/3))-1)^3
 * @author Georg Fischer
 */
public class A061435 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return CR.TEN.pow(CR.valueOf(mN).divide(CR.THREE)).ceil().subtract(Z.ONE).pow(3);
  }
}
