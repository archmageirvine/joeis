package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008585 a(n) = 3*n.
 * @author Sean A. Irvine
 */
public class A008585 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN;
  }
}

