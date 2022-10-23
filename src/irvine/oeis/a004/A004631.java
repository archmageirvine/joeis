package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004631 Squares written in base 16. (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004631 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.square().toString(16));
  }
}

