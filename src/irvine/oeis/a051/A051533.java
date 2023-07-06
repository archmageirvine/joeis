package irvine.oeis.a051;

import irvine.oeis.PairSumSequence;
import irvine.oeis.a000.A000217;

/**
 * A051533 Numbers that are the sum of two positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A051533 extends PairSumSequence {

  /** Construct the sequence. */
  public A051533() {
    super(new A000217().skip(1));
  }
}
