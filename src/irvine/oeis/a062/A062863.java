package irvine.oeis.a062;

import irvine.oeis.FilterPositionSequence;

/**
 * A062863 Numbers which cannot be written as sums of squares of consecutive numbers (even allowing squares of negative numbers).
 * @author Sean A. Irvine
 */
public class A062863 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062863() {
    super(0, new A062862(), ZERO);
  }
}
