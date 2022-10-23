package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001900 Successive numerators of Wallis's approximation to Pi/2 (unreduced).
 * @author Sean A. Irvine
 */
public class A001900 extends Sequence0 {

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
