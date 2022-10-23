package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017411 (11n+1)^11.
 * @author Sean A. Irvine
 */
public class A017411 extends Sequence0 {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

