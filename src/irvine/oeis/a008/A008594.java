package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008594 Multiples of 12: a(n) = 12*n.
 * @author Sean A. Irvine
 */
public class A008594 extends Sequence0 {

  private Z mN = Z.valueOf(-12);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN;
  }
}

