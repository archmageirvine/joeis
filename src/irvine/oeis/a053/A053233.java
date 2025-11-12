package irvine.oeis.a053;

import irvine.oeis.FilterPositionSequence;

/**
 * A053233 Numbers k such that A053230(k) = 2.
 * @author Sean A. Irvine
 */
public class A053233 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A053233() {
    super(1, new A053230(), 2);
  }
}
