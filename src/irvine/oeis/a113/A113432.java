package irvine.oeis.a113;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055600;

/**
 * A113432 Pierpont semiprimes: semiprimes of the form (2^K)*(3^L)+1.
 * @author Georg Fischer
 */
public class A113432 extends AbstractSequence {

  private final A055600 mSeq = new A055600();
  private final int mCount;

  /** Construct the sequence. */
  public A113432() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A113432(final int offset, final int count) {
    super(offset);
    mCount = count;
  }

  @Override
  public Z next() {
    while (true) {
      final Z nz = mSeq.next();
      if (Functions.BIG_OMEGA.l(nz) == mCount) {
        return nz;
      }
    }
  }
}
