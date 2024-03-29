package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008456 12th powers: a(n) = n^12.
 * @author Sean A. Irvine
 */
public class A008456 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(12);
  }
}
