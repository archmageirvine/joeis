package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A002942 <code>a(n) = n^2</code> written backwards.
 * @author Sean A. Irvine
 */
public class A002942 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.reverse(mN.square());
  }
}
