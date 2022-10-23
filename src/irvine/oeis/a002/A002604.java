package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002604 a(n) = n^6 + 1.
 * @author Sean A. Irvine
 */
public class A002604 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(6).add(1);
  }
}
