package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017004 a(n) = (7*n + 1)^12.
 * @author Sean A. Irvine
 */
public class A017004 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

