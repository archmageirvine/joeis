package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008591 Multiples of 9: a(n) = 9*n.
 * @author Sean A. Irvine
 */
public class A008591 extends Sequence0 {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN;
  }
}

