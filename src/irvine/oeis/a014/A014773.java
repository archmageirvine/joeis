package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014773 Squares of odd heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A014773 extends AbstractSequence {

  private final A014637 mSeq1 = new A014637();

  /** Construct the sequence. */
  public A014773() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
