package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025201 a(n) = floor(log(n!)).
 * @author Sean A. Irvine
 */
public class A025201 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return CR.valueOf(mF).log().floor();
  }
}
