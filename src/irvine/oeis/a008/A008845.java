package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008845 Numbers k such that k+1 and k/2+1 are squares.
 * @author Sean A. Irvine
 */
public class A008845 extends AbstractSequence {

  private final A008844 mSeq1 = new A008844();

  /** Construct the sequence. */
  public A008845() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(1).multiply2();
  }
}
