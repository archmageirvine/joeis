package irvine.oeis.a189;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A189820 a(3*k-2) = a(k), a(3*k-1) = a(k), a(3*k) = 1 for k &gt;= 1, starting with a(1) = 0.
 * @author Georg Fischer
 */
public class A189820 extends MemorySequence {

  protected int mN;

  /** Construct the sequence. */
  public A189820() {
    mN = -1;
    next(); // skip a(0)
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN <= 1) {
      return Z.ZERO;
    } else if (mN % 3 == 0) {
      return Z.ONE;
    } else {
      return a((mN + 2) / 3);
    }
  }
}
