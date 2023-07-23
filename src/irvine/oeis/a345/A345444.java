package irvine.oeis.a345;
// manually n2/n2add1 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a344.A344005;

/**
 * A345444 a(n) = A344005(2*n+1).
 * @author Georg Fischer
 */
public class A345444 extends AbstractSequence {

  private final A344005 mSeq1 = new A344005();

  /** Construct the sequence. */
  public A345444() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next();
    mSeq1.next();
    return result;
  }
}
