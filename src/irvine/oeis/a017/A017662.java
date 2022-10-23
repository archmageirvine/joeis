package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017662 (12n+11)^10.
 * @author Sean A. Irvine
 */
public class A017662 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

