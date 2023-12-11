package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;
import irvine.oeis.memory.MemorySequence;

/**
 * A056857 Triangle read by rows: T(n,c) = number of successive equalities in set partitions of n.
 * @author Sean A. Irvine
 */
public class A056857 extends Sequence1 {

  private final MemorySequence mBell = MemorySequence.cachedSequence(new A000110());
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Binomial.binomial(n - 1, m).multiply(mBell.a(n - 1 - m));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

