package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017387 a(n) = (10*n + 9)^11.
 * @author Sean A. Irvine
 */
public class A017387 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

