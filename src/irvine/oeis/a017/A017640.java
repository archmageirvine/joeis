package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017640 a(n) = (12*n + 9)^12.
 * @author Sean A. Irvine
 */
public class A017640 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

