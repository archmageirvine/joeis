package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;

/**
 * A000097 Number of partitions of n if there are two kinds of 1's and two kinds of 2's.
 * @author Sean A. Irvine
 */
public class A000097 extends Sequence0 {

  private int mN = 0;
  private final MemorySequence mS70 = MemorySequence.cachedSequence(new A000070());

  @Override
  public Z next() {
    Z r = Z.ZERO;
    for (int j = 0; j <= mN; j += 2) {
      r = r.add(mS70.a(mN - j));
    }
    ++mN;
    return r;
  }
}

