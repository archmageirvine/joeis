package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a015.A015222;

/**
 * A014798 Squares of even square pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014798 extends AbstractSequence {

  private final A015222 mSeq1 = new A015222();

  /** Construct the sequence. */
  public A014798() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
