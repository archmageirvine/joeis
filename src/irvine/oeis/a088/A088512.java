package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A088512 Number of partitions of n into two parts whose xor-sum is n.
 * a(2*n) = a(n), a(2*n + 1) = 2*a(n) + 1.
 * @author Georg Fischer
 */
public class A088512 extends MemorySequence {

  private int mN;
  private static final Z[] INITS = {Z.ZERO, Z.ZERO};

  /** Construct the sequence. */
  public A088512() {
    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    final int n = mN / 2;
    if (mN < INITS.length) {
      return INITS[mN];
    }
    return ((mN & 1) == 0)
      ? a(n)
      : a(n).multiply2().add(1);
  }
}
