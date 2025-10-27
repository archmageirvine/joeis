package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016812 a(n) = (4*n)^12.
 * @author Sean A. Irvine
 */
public class A016812 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.pow(12);
  }
}

