package irvine.oeis.a128;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024607;
import irvine.oeis.a126.A126757;

/**
 * A128241 Number of n-node (unlabeled) connected graphs with girth 4.
 * @author Georg Fischer
 */
public class A128241 extends AbstractSequence {

  private final A024607 mSeq1 = new A024607();
  private final A126757 mSeq2 = new A126757();

  /** Construct the sequence. */
  public A128241() {
    super(3);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
