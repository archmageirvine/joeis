package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011548 Decimal expansion of <code>sqrt(2)</code> rounded to n places.
 * @author Sean A. Irvine
 */
public class A011548 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.SQRT2.multiply(mA).round();
  }
}
