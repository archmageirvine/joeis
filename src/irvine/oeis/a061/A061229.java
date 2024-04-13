package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061229 Floor of geometric mean of n and the reversal of n.
 * @author Sean A. Irvine
 */
public class A061229 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(Functions.REVERSE.z(mN)).sqrt();
  }
}
