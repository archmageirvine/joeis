package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016836 (4n+2)^12.
 * @author Sean A. Irvine
 */
public class A016836 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.pow(12);
  }
}

