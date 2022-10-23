package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008602 Multiples of 20.
 * @author Sean A. Irvine
 */
public class A008602 extends Sequence0 {

  private Z mN = Z.valueOf(-20);

  @Override
  public Z next() {
    mN = mN.add(20);
    return mN;
  }
}

