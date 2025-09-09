package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005911 Number of points on surface of truncated cube: a(n) = 46*n^2 + 2 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A005911 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(46).add(2);
  }
}
