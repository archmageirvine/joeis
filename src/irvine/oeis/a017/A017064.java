package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017064 a(n) = (7*n+6)^12.
 * @author Sean A. Irvine
 */
public class A017064 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

