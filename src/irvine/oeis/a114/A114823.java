package irvine.oeis.a114;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A114823 Indices of Fibonacci numbers with 13 distinct prime factors.
 * @author Georg Fischer
 */
public class A114823 extends Sequence1 {

  private int mN;
  private final int mNoprf;
  private final A000045 mSeq = new A000045();

  /** Construct the sequence. */
  public A114823() {
    this(13);
  }

  /**
   * Generic constructor with parameters
   * @param noprf number of prime factors
   */
  public A114823(final int noprf) {
    mN = -1;
    mNoprf = noprf;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.OMEGA.i(mSeq.next()) == mNoprf) {
        return Z.valueOf(mN);
      }
    }
  }
}
