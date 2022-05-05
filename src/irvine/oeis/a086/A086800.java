package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.triangle.Triangle;

/**
 * A086800 Triangle read by rows in which row n lists differences between prime(n) and prime(k) for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A086800 extends Triangle {

  private int mDist = 1;
  private MemorySequence mSeq = MemorySequence.cachedSequence(new A000040());

  /** Construct the sequence. */
  public A086800() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == k ? Z.ZERO : mSeq.a(n).subtract(mSeq.a(k));
  }
}
