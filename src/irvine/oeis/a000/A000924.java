package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000924 Class number of Q(sqrt(-n)), n squarefree.
 * @author Sean A. Irvine
 */
public class A000924 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (Mobius.mobius(++mN) == 0) {
      // do nothing
    }
    final long n = -mN;
    return Z.valueOf(LongUtils.classNumber((n & 3) == 1 ? n : 4 * n));
  }
}
