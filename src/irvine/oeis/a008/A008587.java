package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008587 Multiples of 5: a(n) = 5 * n.
 * @author Sean A. Irvine
 */
public class A008587 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN;
  }
}

