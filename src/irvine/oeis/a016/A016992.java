package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016992 a(n) = (7*n)^12.
 * @author Sean A. Irvine
 */
public class A016992 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

