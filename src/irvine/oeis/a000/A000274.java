package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000274 Number of permutations of length n with 2 consecutive ascending pairs.
 * @author Sean A. Irvine
 */
public class A000274 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      final Q t = new Q((mN & 1) == 0 ? 1 - mN : mN - 1, 2);
      mA = new Q(mA.multiply(mN - 1).multiply(mN - 1), Z.valueOf(mN - 2)).add(t).toZ();
    }
    return mA;
  }
}
