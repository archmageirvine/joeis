package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016800 a(n) = (3*n + 2)^12.
 * @author Sean A. Irvine
 */
public class A016800 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN.pow(12);
  }
}

