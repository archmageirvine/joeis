package irvine.oeis.a283;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a070.A070939;
import irvine.oeis.a280.A280700;

/**
 * A283982 a(0) = 0, and for n &gt; 0, a(n) = A070939(n) - A280700(n).
 * @author Georg Fischer
 */
public class A283982 extends AbstractSequence {

  private int mN = -1;
  private final A070939 mSeq1 = new A070939();
  private final A280700 mSeq2 = new A280700();

  /** Construct the sequence. */
  public A283982() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 0) ? Z.ZERO : result;
  }
}
