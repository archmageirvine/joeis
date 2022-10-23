package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016920 a(n) = (6*n)^12.
 * @author Sean A. Irvine
 */
public class A016920 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

