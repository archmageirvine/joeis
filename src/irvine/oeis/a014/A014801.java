package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a015.A015225;

/**
 * A014801 Squares of odd hexagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014801 extends AbstractSequence {

  private final A015225 mSeq1 = new A015225();

  /** Construct the sequence. */
  public A014801() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
