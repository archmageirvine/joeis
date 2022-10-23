package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001015 Seventh powers: a(n) = n^7.
 * @author Sean A. Irvine
 */
public class A001015 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(7);
  }
}
