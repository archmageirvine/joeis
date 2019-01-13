package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001900.
 * @author Sean A. Irvine
 */
public class A001900 implements Sequence {

  private long mN = -1;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = mP.multiply((mN + 1) & ~1);
    }
    return mP;
  }
}
