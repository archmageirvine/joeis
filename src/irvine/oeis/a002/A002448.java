package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.LongUtils;

/**
 * A002448 Expansion of Jacobi theta function <code>theta_4(x)</code>.
 * @author Sean A. Irvine
 */
public class A002448 implements Sequence {

  private static final Z NEG_TWO = Z.valueOf(-2);
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long s = LongUtils.sqrt(mN);
    if (s * s != mN) {
      return Z.ZERO;
    }
    return (mN & 1) == 0 ? Z.TWO : NEG_TWO;
  }
}
