package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017663 a(n) = (12*n + 11)^11.
 * @author Sean A. Irvine
 */
public class A017663 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

