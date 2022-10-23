package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017555 (12n+2)^11.
 * @author Sean A. Irvine
 */
public class A017555 extends Sequence0 {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

