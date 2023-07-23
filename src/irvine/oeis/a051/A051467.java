package irvine.oeis.a051;
// manually div at 2021-08-20 23:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a029.A029640;

/**
 * A051467 (Terms in A029640)/2.
 * @author Georg Fischer
 */
public class A051467 extends AbstractSequence {

  private final A029640 mSeq1 = new A029640();

  /** Construct the sequence. */
  public A051467() {
    super(0);
    mSeq1.next(); // 2 was inserted
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
