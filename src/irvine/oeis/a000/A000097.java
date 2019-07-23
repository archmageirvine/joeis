package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A000097 Number of partitions of n if there are two kinds of <code>1</code>'s and two kinds of <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A000097 implements Sequence {

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

