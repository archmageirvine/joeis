package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017603 (12n+6)^11.
 * @author Sean A. Irvine
 */
public class A017603 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

