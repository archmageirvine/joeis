package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017580 (12n+4)^12.
 * @author Sean A. Irvine
 */
public class A017580 extends Sequence0 {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

