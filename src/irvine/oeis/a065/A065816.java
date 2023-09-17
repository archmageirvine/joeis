package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;

/**
 * A065816 Numbers k such that the alternating sum of digits of k^2 is 0.
 * @author Sean A. Irvine
 */
public class A065816 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065816() {
    super(1, new A065796(), ZERO);
  }
}

