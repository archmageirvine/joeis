package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011551 Decimal expansion of phi truncated to n places.
 * @author Sean A. Irvine
 */
public class A011551 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PHI.multiply(mA).floor();
  }
}
