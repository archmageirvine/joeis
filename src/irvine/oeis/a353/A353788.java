package irvine.oeis.a353;
// manually anopan 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a302.A302048;

/**
 * A353788 a(n) = 1 if the number of divisors of n is either 2 or 4, otherwise 0.
 * @author Georg Fischer
 */
public class A353788 extends AbstractSequence {

  private int mN = 0;
  private final A353799 mSeq1 = new A353799();
  private final A302048 mSeq2 = new A302048();

  /** Construct the sequence. */
  public A353788() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
