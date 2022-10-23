package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017592 (12n+5)^12.
 * @author Sean A. Irvine
 */
public class A017592 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

