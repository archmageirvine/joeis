package irvine.oeis.a078;
// manually anopan 2,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a003.A003022;

/**
 * A078106 a(n) = A003022(n) - A000217(n-1).
 * @author Georg Fischer
 */
public class A078106 extends AbstractSequence {

  private final A003022 mSeq1 = new A003022();
  private final A000217 mSeq2 = new A000217();

  /** Construct the sequence. */
  public A078106() {
    super(2);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
