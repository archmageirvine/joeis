package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014748 Squares of numbers in array formed from elements to the right of middle of rows of triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014748 extends AbstractSequence {

  private final A014467 mSeq1 = new A014467();

  /** Construct the sequence. */
  public A014748() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
