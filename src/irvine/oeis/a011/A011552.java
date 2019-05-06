package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011552 Decimal expansion of phi rounded to n places.
 * @author Sean A. Irvine
 */
public class A011552 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PHI.multiply(CR.valueOf(mA)).round(32);
  }
}
