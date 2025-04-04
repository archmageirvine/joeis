package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;

/**
 * A072595 Numbers k such that A072594(k) = 0.
 * @author Sean A. Irvine
 */
public class A072595 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072595() {
    super(1, new A072594(), ZERO);
  }
}
