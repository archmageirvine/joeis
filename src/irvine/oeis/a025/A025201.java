package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025201 a(n) = floor(log(n!)).
 * @author Sean A. Irvine
 */
public class A025201 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return CR.valueOf(mF).log().floor();
  }
}
