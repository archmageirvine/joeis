package irvine.oeis.a161;
// manually n2 at 2023-05-02 19:36

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a070.A070824;

/**
 * A161116 a(n) is the number of nontrivial positive divisors of 2n+3.
 * @author Georg Fischer
 */
public class A161116 extends AbstractSequence {

  private final A070824 mSeq1 = new A070824();

  /** Construct the sequence. */
  public A161116() {
    super(0);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    mSeq1.next();
    return mSeq1.next();
  }
}
