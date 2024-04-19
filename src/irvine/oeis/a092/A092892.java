package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006666;
import irvine.oeis.memory.MemorySequence;

/**
 * A092892 Smallest starting value in a Collatz '3x+1' sequence such that the sequence contains exactly n halving steps.
 * @author Georg Fischer
 */
public class A092892 extends Sequence0 {

  private final MemorySequence mSeq = MemorySequence.cache(1, new A006666());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    int m = 0;
    while (!mSeq.a(++m).equals(n)) {
    }
    return Z.valueOf(m);
  }
}
