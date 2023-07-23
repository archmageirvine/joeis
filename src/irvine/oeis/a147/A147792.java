package irvine.oeis.a147;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061042;

/**
 * A147792 A quadrisection of A061042.
 * @author Georg Fischer
 */
public class A147792 extends AbstractSequence {

  private final A061042 mSeq1 = new A061042();

  /** Construct the sequence. */
  public A147792() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    return result;
  }
}
