package irvine.oeis.a075;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a048.A048702;

/**
 * A075113 a(n) = A000217(n) - A048702(n).
 * @author Georg Fischer
 */
public class A075113 extends AbstractSequence {

  private A000217 mSeq1 = new A000217();
  private A048702 mSeq2 = new A048702();

  /** Construct the sequence. */
  public A075113() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
