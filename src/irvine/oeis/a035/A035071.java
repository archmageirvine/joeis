package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035071 a(n) = ceiling(sqrt(4*10^n)).
 * @author Sean A. Irvine
 */
public class A035071 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
