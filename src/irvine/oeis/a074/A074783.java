package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074783 a(n) = floor(1/sin(x(n))) where x(n) is Pi truncated at the n-th decimal digit.
 * @author Sean A. Irvine
 */
public class A074783 extends Sequence0 {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(10);
    }
    return ComputableReals.SINGLETON.csc(CR.valueOf(CR.PI.multiply(mT).floor()).divide(mT)).floor();
  }
}
