package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002620 Quarter-squares: floor(n/2)*ceiling(n/2). Equivalently, floor(n^2/4).
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
