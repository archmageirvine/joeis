package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017028 a(n) = (7*n + 3)^12.
 * @author Sean A. Irvine
 */
public class A017028 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

