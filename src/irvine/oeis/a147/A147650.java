package irvine.oeis.a147;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061040;

/**
 * A147650 First trisection of A061040.
 * @author Georg Fischer
 */
public class A147650 extends AbstractSequence {

  private final A061040 mSeq1 = new A061040();

  /** Construct the sequence. */
  public A147650() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    return result;
  }
}
