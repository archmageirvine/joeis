package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A087808 a(0) = 0; a(2n) = 2a(n), a(2n+1) = a(n) + 1.
 * @author Georg Fischer
 */
public class A087808 extends MemorySequence {

  private int mN;

  /** Construct the sequence. */
  public A087808() {
    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    final int n = mN / 2;
    return mN == 0 ? Z.ZERO : (((mN & 1) == 0)
      ? a(n).multiply2()
      : a(n).add(1));
  }
}
