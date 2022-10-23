package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017496 a(n) = (11*n + 8)^12.
 * @author Sean A. Irvine
 */
public class A017496 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

