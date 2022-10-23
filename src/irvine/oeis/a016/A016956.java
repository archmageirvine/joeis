package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016956 a(n) = (6*n + 3)^12.
 * @author Sean A. Irvine
 */
public class A016956 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

