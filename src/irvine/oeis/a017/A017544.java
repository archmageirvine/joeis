package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017544 (12n+1)^12.
 * @author Sean A. Irvine
 */
public class A017544 extends Sequence0 {

  private Z mN = Z.valueOf(-11);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

