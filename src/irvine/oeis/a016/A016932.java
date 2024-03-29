package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016932 a(n) = (6*n + 1)^12.
 * @author Sean A. Irvine
 */
public class A016932 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

