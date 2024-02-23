package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067084 Number of digits in n^{(n-1)!}.
 * @author Sean A. Irvine
 */
public class A067084 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      mF = mF.multiply(mN - 1);
    }
    return CR.valueOf(mN).log10().multiply(mF).floor().add(1);
  }
}
