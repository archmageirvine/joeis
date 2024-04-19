package irvine.oeis.a260;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a003.A003309;

/**
 * A260722 Difference between n-th odd Ludic and n-th Lucky number: a(1) = 0; for n &gt; 1: a(n) = A003309(n+1) - A000959(n).
 * @author Georg Fischer
 */
public class A260722 extends AbstractSequence {

  private int mN = 0;
  private final A003309 mSeq1 = new A003309();
  private final A000959 mSeq2 = new A000959();

  /** Construct the sequence. */
  public A260722() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
