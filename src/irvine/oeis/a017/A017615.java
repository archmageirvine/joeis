package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017615 a(n) = (12*n+7)^11.
 * @author Sean A. Irvine
 */
public class A017615 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

