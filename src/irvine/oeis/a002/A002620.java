package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002620 Quarter-squares: <code>floor(n/2)*ceiling(n/2)</code>. Equivalently, <code>floor(n^2/4)</code>.
 * @author Sean A. Irvine
 */
public class A002620 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide(4);
  }
}
