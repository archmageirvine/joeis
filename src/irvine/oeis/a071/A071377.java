package irvine.oeis.a071;

import irvine.oeis.PartialSumSequence;

/**
 * A071377 Number of positive integers &lt;= n which are the sum of 3 squares.
 * @author Sean A. Irvine
 */
public class A071377 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071377() {
    super(0, new A071374().skip());
  }
}
