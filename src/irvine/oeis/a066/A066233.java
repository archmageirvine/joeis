package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;

/**
 * A066233 Numbers n such that the sum of digits of n^n is a prime.
 * @author Sean A. Irvine
 */
public class A066233 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066233() {
    super(1, 1, new A066588(), PRIME);
  }
}
