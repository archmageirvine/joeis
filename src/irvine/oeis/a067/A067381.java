package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067381 Smallest prime expressible as the sum of (at least two) consecutive primes in n ways.
 * @author Sean A. Irvine
 */
public class A067381 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    return new A067380(2, MemorySequence.cachedSequence(new A000040()), ++mN).next();
  }
}

