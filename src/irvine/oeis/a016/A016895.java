package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016895 (5n+3)^11.
 * @author Sean A. Irvine
 */
public class A016895 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(11);
  }
}

