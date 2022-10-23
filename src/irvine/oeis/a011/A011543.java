package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011543 Decimal expansion of e truncated to n places.
 * @author Sean A. Irvine
 */
public class A011543 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.E.multiply(mA).floor();
  }
}
