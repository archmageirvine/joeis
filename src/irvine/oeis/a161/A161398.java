package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161398.
 * @author Sean A. Irvine
 */
public class A161398 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final long pc = PopCount.popcount(++mN);
    if (pc == 1) {
      return Z.ONE;
    }
    for (final Z dd : Cheetah.factor(mN).divisorsSorted()) {
      if (dd.bitCount() == pc) {
        return dd;
      }
    }
    return null;
  }
}

