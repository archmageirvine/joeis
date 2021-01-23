package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161398 a(n) = the smallest divisor of n that contains the same number of 1's as n when both numbers are written in binary.
 * @author Sean A. Irvine
 */
public class A161398 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final long pc = Long.bitCount(++mN);
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

