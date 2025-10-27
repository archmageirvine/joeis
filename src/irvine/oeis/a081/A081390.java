package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081390 Number k such that the k-th Catalan number has only one non-unitary prime divisor; all the other prime divisors have exponent one.
 * @author Sean A. Irvine
 */
public class A081390 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081390() {
    super(1, new A081389(), ONE);
  }
}
