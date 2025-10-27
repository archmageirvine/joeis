package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016824 a(n) = (4*n + 1)^12.
 * @author Sean A. Irvine
 */
public class A016824 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.pow(12);
  }
}

