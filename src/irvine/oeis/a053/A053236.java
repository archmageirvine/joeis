package irvine.oeis.a053;

import irvine.oeis.FilterPositionSequence;

/**
 * A053236 Numbers k such that A053230(k) = 4.
 * @author Sean A. Irvine
 */
public class A053236 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A053236() {
    super(1, new A053230(), 4);
  }
}
