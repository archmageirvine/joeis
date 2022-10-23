package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017590 a(n) = (12*n+5)^10.
 * @author Sean A. Irvine
 */
public class A017590 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

