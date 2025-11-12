package irvine.oeis.a053;

import irvine.oeis.FilterPositionSequence;

/**
 * A053235 Numbers k such that A053230(k) = 3.
 * @author Sean A. Irvine
 */
public class A053235 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A053235() {
    super(1, new A053230(), 3);
  }
}
