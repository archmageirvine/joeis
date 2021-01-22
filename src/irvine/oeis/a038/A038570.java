package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038570 Second derivative of n.
 * @author Sean A. Irvine
 */
public class A038570 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    final long m = (mN ^ (mN >>> 1)) - (1L << LongUtils.lg(mN));
    return m < 2 ? Z.ZERO : Z.valueOf((m ^ (m >>> 1)) - (1L << LongUtils.lg(m)));
  }
}
