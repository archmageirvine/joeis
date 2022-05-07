package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A214972 a(n) = a(floor(2*(n-1)/3)) + 1, where a(0) = 0.
 * @author Georg Fischer
 */
public class A214972 extends MemorySequence {

  private int mN;

  /** Construct the sequence. */
  public A214972() {

    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    } else {
      return a(2 * (mN - 1) / 3).add(1);
    }
  }
}
