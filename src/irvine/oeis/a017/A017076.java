package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017076 a(n) = (8*n)^12.
 * @author Sean A. Irvine
 */
public class A017076 extends Sequence0 {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(12);
  }
}

