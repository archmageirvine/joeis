package irvine.oeis.a114;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A114812 Indices of Fibonacci numbers with 3 prime factors when counted with multiplicity.
 * @author Georg Fischer
 */
public class A114812 extends Sequence1 {

  private int mN;
  private final int mNoprf;
  private final A000045 mSeq = new A000045();

  /** Construct the sequence. */
  public A114812() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param noprf number of prime factors
   */
  public A114812(final int noprf) {
    mN = -1;
    mNoprf = noprf;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(mSeq.next()).bigOmega() == mNoprf) {
        return Z.valueOf(mN);
      }
    }
  }
}
