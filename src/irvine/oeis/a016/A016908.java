package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016908 a(n) = (5*n + 4)^12.
 * @author Sean A. Irvine
 */
public class A016908 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

