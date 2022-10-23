package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001017 Ninth powers: a(n) = n^9.
 * @author Sean A. Irvine
 */
public class A001017 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(9);
  }
}
