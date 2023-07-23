package irvine.oeis.a146;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061043;

/**
 * A146975 First quintisection of A061043: A061043(5n).
 * @author Georg Fischer
 */
public class A146975 extends AbstractSequence {

  private final A061043 mSeq1 = new A061043();

  /** Construct the sequence. */
  public A146975() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    return result;
  }
}
