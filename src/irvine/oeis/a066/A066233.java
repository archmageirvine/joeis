package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;

/**
 * A066233 Numbers k such that the sum of digits of k^k is a prime.
 * @author Sean A. Irvine
 */
public class A066233 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066233() {
    super(1, 0, new A066588(), PRIME);
  }
}
