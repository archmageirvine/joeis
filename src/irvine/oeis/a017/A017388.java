package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017388 a(n) = (10*n + 9)^12.
 * @author Sean A. Irvine
 */
public class A017388 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

